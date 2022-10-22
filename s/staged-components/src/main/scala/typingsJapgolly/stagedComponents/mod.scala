package typingsJapgolly.stagedComponents

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("staged-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def staged[P](stage: StageRenderRoot[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("staged")(stage.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  inline def staged[P, R](stage: StageRenderRootWithRef[P, R]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("staged")(stage.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  trait StageRender extends StObject {
    
    def apply(): StageRender | Element | Null = js.native
  }
  
  type StageRenderRoot[P] = js.Function1[/* props */ PropsWithChildren[P], StageRender | Element | Null]
  
  type StageRenderRootWithRef[P, R] = js.Function2[/* props */ PropsWithChildren[P], /* ref */ Ref[R], StageRender | Element | Null]
}
