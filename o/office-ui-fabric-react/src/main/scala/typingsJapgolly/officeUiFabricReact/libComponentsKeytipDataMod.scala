package typingsJapgolly.officeUiFabricReact

import org.scalajs.dom.HTMLElement
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.IKeytipDataProps
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.KeytipDataOptions
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.uifabricUtilities.libIrendercomponentMod.IRenderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsKeytipDataMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipData", "KeytipData")
  @js.native
  val KeytipData: FunctionComponent[IKeytipDataProps & IRenderComponent[js.Object]] = js.native
  
  inline def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeytipRef")(options.asInstanceOf[js.Any]).asInstanceOf[Ref[TElement]]
}
