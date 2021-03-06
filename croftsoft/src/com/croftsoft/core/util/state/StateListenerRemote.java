     package com.croftsoft.core.util.state;

     import java.rmi.*;

     /*********************************************************************
     *
     * An interface for listeners of object State updates.
     *
     * @author
     *   <A HREF="http://www.alumni.caltech.edu/~croft/">David W. Croft</A>
     * @version
     *   1998-11-23
     *********************************************************************/

     public interface  StateListenerRemote extends Remote
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     {

     public void  stateListen ( State  state )
       throws RemoteException;

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
