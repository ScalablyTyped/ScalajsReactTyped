package typingsJapgolly.popmotionPose

import org.scalajs.dom.Element
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionPoser
import typingsJapgolly.poseCore.libTypesMod.ActiveActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomEventsMod {
  
  @JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    element: Element,
    activeActions: ActiveActions[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any
    ],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], activeActions.asInstanceOf[js.Any], poser.asInstanceOf[js.Any], hasProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
