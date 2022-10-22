package typingsJapgolly.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.officeUiFabricReact.libComponentsTextTextDottypesMod.ITextProps
import typingsJapgolly.officeUiFabricReact.libComponentsTextTextDottypesMod.ITextStyles
import typingsJapgolly.officeUiFabricReact.libComponentsTextTextDottypesMod.ITextTokens
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IViewComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/components/Text", JSImport.Default)
  @js.native
  val default: FunctionComponent[ITextProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Text", "Text")
  @js.native
  val Text: FunctionComponent[ITextProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Text", "TextStyles")
  @js.native
  val TextStyles: IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Text", "TextView")
  @js.native
  val TextView: IViewComponent[ITextProps] = js.native
  
  type _To = FunctionComponent[ITextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTextMod.foo` */
  override def _to: FunctionComponent[ITextProps] = default
}
