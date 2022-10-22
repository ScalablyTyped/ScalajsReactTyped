package typingsJapgolly.rcTree.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcTree.esIndentMod.IndentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Indent {
  
  inline def apply(isEnd: js.Array[Boolean], isStart: js.Array[Boolean], level: Double, prefixCls: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasPrefixClsLevelIsStartIsEnd */ IndentProps]))
  }
  
  @JSImport("rc-tree/es/Indent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasPrefixClsLevelIsStartIsEnd */ IndentProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
