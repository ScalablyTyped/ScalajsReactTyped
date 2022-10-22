package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An {@link XAccessControlContext} is used to make system resource access decisions based on the context it encapsulates.
  *
  * More specifically, it encapsulates a context and has methods to check permissions equivalent to {@link XAccessController} interface, with one
  * difference: The {@link XAccessControlContext} makes access decisions based on the context it encapsulates, rather than that of the current execution
  * thread.
  * @since OOo 1.1.2
  */
trait XAccessControlContext
  extends StObject
     with XInterface {
  
  /**
    * Determines whether the access request indicated by the specified permission should be allowed or denied, based on this context. The semantics are
    * equivalent to the security permission classes of the Java platform.
    *
    * You can also pass a sequence of permissions (sequence< any >) to check a set of permissions, e.g. for performance reasons. This method quietly returns
    * if the access request is permitted, or throws a suitable {@link AccessControlException} otherwise.
    * @param perm permission to be checked
    * @see com.sun.star.security.AccessControlException
    * @see com.sun.star.security.AllPermission
    * @see com.sun.star.security.RuntimePermission
    * @see com.sun.star.io.FilePermission
    * @see com.sun.star.connection.SocketPermission
    * @throws AccessControlException thrown if access is denied
    */
  def checkPermission(perm: Any): Unit
}
object XAccessControlContext {
  
  inline def apply(
    acquire: Callback,
    checkPermission: Any => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessControlContext = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, checkPermission = js.Any.fromFunction1((t0: Any) => checkPermission(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessControlContext]
  }
  
  extension [Self <: XAccessControlContext](x: Self) {
    
    inline def setCheckPermission(value: Any => Callback): Self = StObject.set(x, "checkPermission", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
