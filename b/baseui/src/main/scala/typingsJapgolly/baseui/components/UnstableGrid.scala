package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.layoutGridTypesMod.GridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableGrid {
  
  @JSImport("baseui/layout-grid", "UnstableGrid")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: UnstableGrid.type): SharedBuilder_GridProps_582453108 = new SharedBuilder_GridProps_582453108(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: /* hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides */ GridProps
  ): SharedBuilder_GridProps_582453108 = new SharedBuilder_GridProps_582453108(js.Array(this.component, p.asInstanceOf[js.Any]))
}
