package typingsJapgolly.jsdevtoolsOno

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsdevtoolsOno.esmTypesMod.ErrorLike
import typingsJapgolly.jsdevtoolsOno.jsdevtoolsOnoBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmStackMod {
  
  @JSImport("@jsdevtools/ono/esm/stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLazyStack(): /* is @jsdevtools/ono.@jsdevtools/ono/esm/stack.LazyStack */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLazyStack")().asInstanceOf[/* is @jsdevtools/ono.@jsdevtools/ono/esm/stack.LazyStack */ Boolean]
  inline def isLazyStack(stackProp: js.PropertyDescriptor): /* is @jsdevtools/ono.@jsdevtools/ono/esm/stack.LazyStack */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLazyStack")(stackProp.asInstanceOf[js.Any]).asInstanceOf[/* is @jsdevtools/ono.@jsdevtools/ono/esm/stack.LazyStack */ Boolean]
  
  inline def isWritableStack(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWritableStack")().asInstanceOf[Boolean]
  inline def isWritableStack(stackProp: js.PropertyDescriptor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWritableStack")(stackProp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def joinStacks(newError: ErrorLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("joinStacks")(newError.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def joinStacks(newError: ErrorLike, originalError: ErrorLike): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinStacks")(newError.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def lazyJoinStacks(lazyStack: LazyStack, newError: ErrorLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyJoinStacks")(lazyStack.asInstanceOf[js.Any], newError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lazyJoinStacks(lazyStack: LazyStack, newError: ErrorLike, originalError: ErrorLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyJoinStacks")(lazyStack.asInstanceOf[js.Any], newError.asInstanceOf[js.Any], originalError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The Property Descriptor of a lazily-computed `stack` property.
    */
  trait LazyStack extends StObject {
    
    var configurable: `true`
    
    /**
      * Lazily computes the error's stack trace.
      */
    def get(): js.UndefOr[String]
  }
  object LazyStack {
    
    inline def apply(get: CallbackTo[js.UndefOr[String]]): LazyStack = {
      val __obj = js.Dynamic.literal(configurable = true, get = get.toJsFn)
      __obj.asInstanceOf[LazyStack]
    }
    
    extension [Self <: LazyStack](x: Self) {
      
      inline def setConfigurable(value: `true`): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      inline def setGet(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "get", value.toJsFn)
    }
  }
}
