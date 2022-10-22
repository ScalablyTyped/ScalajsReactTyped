package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.blockTypesMod.BlockProps
import typingsJapgolly.baseui.blockTypesMod.StyledBlockProps
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioBoxAspectRatioBoxBodyMod extends Shortcut {
  
  @JSImport("baseui/aspect-ratio-box/aspect-ratio-box-body", JSImport.Default)
  @js.native
  val default: AspectRatioBoxBodyComponentType[div] = js.native
  
  @JSImport("baseui/aspect-ratio-box/aspect-ratio-box-body", "AspectRatioBoxBody")
  @js.native
  val AspectRatioBoxBody: AspectRatioBoxBodyComponentType[div] = js.native
  
  @js.native
  trait AspectRatioBoxBodyComponentType[D /* <: ElementType */] extends StObject {
    
    def apply[C /* <: ElementType */](
      props: BlockProps[C] & (Omit[
          StyledBlockProps & ComponentProps[C], 
          /* keyof baseui.baseui/block/types.BlockProps<react.react.ElementType<any>> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.baseui.baseuiStrings.children, typingsJapgolly.baseui.baseuiStrings.as_, typingsJapgolly.baseui.baseuiStrings.overrides */ Any
        ])
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = AspectRatioBoxBodyComponentType[div]
  
  /* This means you don't have to write `default`, but can instead just say `aspectRatioBoxAspectRatioBoxBodyMod.foo` */
  override def _to: AspectRatioBoxBodyComponentType[div] = default
}
