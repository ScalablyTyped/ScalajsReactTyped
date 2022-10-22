package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.aspectRatioBoxTypesMod.AspectRatioBoxProps
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.blockTypesMod.StyledBlockProps
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioBoxAspectRatioBoxMod extends Shortcut {
  
  @JSImport("baseui/aspect-ratio-box/aspect-ratio-box", JSImport.Default)
  @js.native
  val default: AspectRatioCoxComponentType[div] = js.native
  
  @js.native
  trait AspectRatioCoxComponentType[D /* <: ElementType */] extends StObject {
    
    def apply[C /* <: ElementType */](
      props: AspectRatioBoxProps[C] & (/* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<C> extends {  ref :infer R | undefined} ? {  ref :R | undefined} : {} */ js.Any) & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/aspect-ratio-box/types.AspectRatioBoxProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 69, starting with typingsJapgolly.baseui.baseuiStrings.aspectRatio, typingsJapgolly.baseui.baseuiStrings.children, typingsJapgolly.baseui.baseuiStrings.as_ */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = AspectRatioCoxComponentType[div]
  
  /* This means you don't have to write `default`, but can instead just say `aspectRatioBoxAspectRatioBoxMod.foo` */
  override def _to: AspectRatioCoxComponentType[div] = default
}
