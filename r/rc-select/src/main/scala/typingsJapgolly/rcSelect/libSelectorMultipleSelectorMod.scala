package typingsJapgolly.rcSelect

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcSelect.libBaseSelectMod.CustomTagProps
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.libSelectorMod.InnerSelectorProps
import typingsJapgolly.rcSelect.rcSelectStrings.responsive
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorMultipleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/MultipleSelector", JSImport.Default)
  @js.native
  val default: FC[SelectorProps] = js.native
  
  @js.native
  trait SelectorProps
    extends StObject
       with InnerSelectorProps {
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.native
    
    var maxTagPlaceholder: js.UndefOr[Node | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], Node])] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    def onRemove(value: DisplayValueType): Unit = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, Element]] = js.native
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  }
  
  type _To = FC[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorMultipleSelectorMod.foo` */
  override def _to: FC[SelectorProps] = default
}
