package typingsJapgolly.reactSvgMorph.components

import typingsJapgolly.reactSvgMorph.anon.From
import typingsJapgolly.reactSvgMorph.mod.MorphTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MorphTransitionResize {
  
  inline def apply(children: From): SharedBuilder_MorphTransitionProps269053229[typingsJapgolly.reactSvgMorph.mod.MorphTransitionResize] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_MorphTransitionProps269053229[typingsJapgolly.reactSvgMorph.mod.MorphTransitionResize](js.Array(this.component, __props.asInstanceOf[MorphTransitionProps]))
  }
  
  @JSImport("react-svg-morph", "MorphTransitionResize")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MorphTransitionProps): SharedBuilder_MorphTransitionProps269053229[typingsJapgolly.reactSvgMorph.mod.MorphTransitionResize] = new SharedBuilder_MorphTransitionProps269053229[typingsJapgolly.reactSvgMorph.mod.MorphTransitionResize](js.Array(this.component, p.asInstanceOf[js.Any]))
}
