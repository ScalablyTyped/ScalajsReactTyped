package typingsJapgolly.reactMixin

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Mixin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-mixin", JSImport.Namespace)
  @js.native
  val ^ : ReactMixin = js.native
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
  
  @js.native
  trait ReactMixin extends StObject {
    
    def apply[S](clazz: Any, mixin: Mixin[Any, Any]): ComponentClassP[S & js.Object] = js.native
    
    def decorate(mixin: Mixin[Any, Any]): ClassDecorator = js.native
    
    def onClass[S](clazz: Any, mixin: Mixin[Any, Any]): ComponentClassP[S & js.Object] = js.native
  }
  
  type _To = ReactMixin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ReactMixin = ^
}
