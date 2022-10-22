package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for checking permissions and invoking privileged or restricted actions.
  * @since OOo 1.1.2
  */
trait XAccessController
  extends StObject
     with XInterface {
  
  /**
    * This method takes a "snapshot" of the current calling context and returns it.
    *
    * This context may then be checked at a later point, possibly in another thread.
    * @returns snapshot of context
    */
  val Context: XAccessControlContext
  
  /**
    * Determines whether the access request indicated by the specified permission should be allowed or denied, based on the security policy currently in
    * effect. The semantics are equivalent to the security permission classes of the Java platform.
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
  
  /**
    * Perform the specified action adding a set of permissions defined by the given {@link XAccessControlContext} . The action is performed with the union
    * of the permissions of the currently installed {@link XAccessControlContext} , the given {@link XAccessControlContext} and the security policy
    * currently in effect. The latter includes static security, e.g. based on user credentials.
    *
    * If the given {@link XAccessControlContext} is null, then the action is performed **only** with the permissions of the security policy currently in
    * effect.
    * @param action action object to be executed
    * @param restriction access control context to restrict permission; null for no restriction
    * @returns result
    * @throws com::sun::star::uno::Exception any UNO exception may be thrown
    */
  def doPrivileged(action: XAction, restriction: XAccessControlContext): Any
  
  /**
    * Perform the specified action restricting permissions to the given {@link XAccessControlContext} . The action is performed with the intersection of the
    * permissions of the currently installed {@link XAccessControlContext} , the given {@link XAccessControlContext} and the security policy currently in
    * effect. The latter includes static security, e.g. based on user credentials.
    *
    * If the specified {@link XAccessControlContext} is null, then the action is performed with unmodified permissions, i.e. the call makes no sense.
    * @param action action object to be executed
    * @param restriction access control context to restrict permission; null for no restriction
    * @returns result
    * @throws com::sun::star::uno::Exception any UNO exception may be thrown
    */
  def doRestricted(action: XAction, restriction: XAccessControlContext): Any
  
  /**
    * This method takes a "snapshot" of the current calling context and returns it.
    *
    * This context may then be checked at a later point, possibly in another thread.
    * @returns snapshot of context
    */
  def getContext(): XAccessControlContext
}
object XAccessController {
  
  inline def apply(
    Context: XAccessControlContext,
    acquire: Callback,
    checkPermission: Any => Callback,
    doPrivileged: (XAction, XAccessControlContext) => Any,
    doRestricted: (XAction, XAccessControlContext) => Any,
    getContext: CallbackTo[XAccessControlContext],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessController = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], acquire = acquire.toJsFn, checkPermission = js.Any.fromFunction1((t0: Any) => checkPermission(t0).runNow()), doPrivileged = js.Any.fromFunction2(doPrivileged), doRestricted = js.Any.fromFunction2(doRestricted), getContext = getContext.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessController]
  }
  
  extension [Self <: XAccessController](x: Self) {
    
    inline def setCheckPermission(value: Any => Callback): Self = StObject.set(x, "checkPermission", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setContext(value: XAccessControlContext): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setDoPrivileged(value: (XAction, XAccessControlContext) => Any): Self = StObject.set(x, "doPrivileged", js.Any.fromFunction2(value))
    
    inline def setDoRestricted(value: (XAction, XAccessControlContext) => Any): Self = StObject.set(x, "doRestricted", js.Any.fromFunction2(value))
    
    inline def setGetContext(value: CallbackTo[XAccessControlContext]): Self = StObject.set(x, "getContext", value.toJsFn)
  }
}
