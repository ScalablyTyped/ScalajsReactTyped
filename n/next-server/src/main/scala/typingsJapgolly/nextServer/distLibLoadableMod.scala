package typingsJapgolly.nextServer

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibLoadableMod extends Shortcut {
  
  @JSImport("next-server/dist/lib/loadable", JSImport.Namespace)
  @js.native
  val ^ : ILoadable = js.native
  
  @js.native
  trait ILoadable extends StObject {
    
    def apply[P](opts: Any): ComponentClassP[P & js.Object] = js.native
    
    def Map[P](opts: Any): ComponentType[P] = js.native
    
    def preloadAll(): js.Promise[Any] = js.native
  }
  
  type _To = ILoadable
  
  /* This means you don't have to write `^`, but can instead just say `distLibLoadableMod.foo` */
  override def _to: ILoadable = ^
}
