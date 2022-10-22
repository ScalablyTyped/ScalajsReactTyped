package typingsJapgolly.popmotionPose

import org.scalajs.dom.Element
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionPoser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomPoseMod {
  
  @JSImport("popmotion-pose/lib/dom/pose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[DomPopmotionPoser]
}
