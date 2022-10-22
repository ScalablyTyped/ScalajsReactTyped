package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.materialUiCore.anon.Fn0
import typingsJapgolly.materialUiCore.anon.Fn1
import typingsJapgolly.materialUiCore.anon.NonePSnodeReactElementopt
import typingsJapgolly.materialUiCore.anon.PartialMountOptions
import typingsJapgolly.materialUiCore.anon.PartialRenderOptions
import typingsJapgolly.materialUiCore.anon.PartialShallowOptions
import typingsJapgolly.materialUiCore.anon.PartialwithThemeboolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("@material-ui/core/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMount(): NonePSnodeReactElementopt = ^.asInstanceOf[js.Dynamic].applyDynamic("createMount")().asInstanceOf[NonePSnodeReactElementopt]
  inline def createMount(options: PartialMountOptions): NonePSnodeReactElementopt = ^.asInstanceOf[js.Dynamic].applyDynamic("createMount")(options.asInstanceOf[js.Any]).asInstanceOf[NonePSnodeReactElementopt]
  
  inline def createRender(): Fn0 = ^.asInstanceOf[js.Dynamic].applyDynamic("createRender")().asInstanceOf[Fn0]
  inline def createRender(options: PartialRenderOptions): Fn0 = ^.asInstanceOf[js.Dynamic].applyDynamic("createRender")(options.asInstanceOf[js.Any]).asInstanceOf[Fn0]
  
  inline def createShallow(): Fn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("createShallow")().asInstanceOf[Fn1]
  inline def createShallow(options: PartialShallowOptions): Fn1 = ^.asInstanceOf[js.Dynamic].applyDynamic("createShallow")(options.asInstanceOf[js.Any]).asInstanceOf[Fn1]
  
  inline def findOutermostIntrinsic(reactWrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]): ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOutermostIntrinsic")(reactWrapper.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]]
  
  inline def getClasses[T](element: Element): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getClasses")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def getClasses[T](element: Element, options: PartialwithThemeboolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getClasses")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def unwrap(element: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
}
