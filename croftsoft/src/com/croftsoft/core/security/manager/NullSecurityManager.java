     package com.croftsoft.core.security.manager;

     import java.io.FileDescriptor;
     import java.net.InetAddress;

     /*********************************************************************
     * Disables all security checks.
     *
     * <PRE>
     *
     * if ( System.getSecurityManager ( ) == null )
     * {
     *   System.setSecurityManager ( new NullSecurityManager ( ) );
     * }
     *
     * </PRE>
     *
     * @author
     *   <A HREF="http://www.alumni.caltech.edu/~croft/">David W. Croft</A>
     * @version
     *   1999-02-07
     *********************************************************************/

     public class  NullSecurityManager extends SecurityManager
     //////////////////////////////////////////////////////////////////////
     // The source code is also useful as a template for writing new custom
     // SecurityManagers.
     //////////////////////////////////////////////////////////////////////
     {

     public void  checkAccept ( String  host, int  port )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkAccess ( Thread  t )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkAccess ( ThreadGroup  g )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkAwtEventQueueAccess ( )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkConnect ( String  host, int  port )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkConnect ( String  host, int  port, Object  context )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkCreateClassLoader ( )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkDelete ( String  file )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkExec ( String  cmd )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkExit ( int  status )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkLink ( String  libname )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkListen ( int  port )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkMemberAccess ( Class  clazz, int  which )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkMulticast ( InetAddress  maddr )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkMulticast ( InetAddress  maddr, byte  ttl )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkPackageAccess ( String  pkg )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkPackageDefinition ( String  pkg )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkPrintJobAccess ( )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkPropertiesAccess ( )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkPropertyAccess ( String  key )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkRead ( FileDescriptor  fd )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkRead ( String  file )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkRead ( String  file, Object  context )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkSecurityAccess ( String  action )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkSetFactory ( )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkSystemClipboardAccess ( )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public boolean  checkTopLevelWindow ( Object  window )
     //////////////////////////////////////////////////////////////////////
     {
       return true;
     }

     public void  checkWrite ( FileDescriptor  fd )
     //////////////////////////////////////////////////////////////////////
     {
     }

     public void  checkWrite ( String  file )
     //////////////////////////////////////////////////////////////////////
     {
     }

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     }
