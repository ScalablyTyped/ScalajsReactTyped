package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service is implemented by the graphic presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
trait GraphicObjectShape
  extends StObject
     with Shape
     with typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.GraphicObjectShape
object GraphicObjectShape {
  
  inline def apply(
    Bookmark: String,
    DimColor: Color,
    DimHide: Boolean,
    DimPrevious: Boolean,
    Effect: AnimationEffect,
    GraphicObjectShape: typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.GraphicObjectShape,
    IsEmptyPresentationObject: Boolean,
    IsPresentationObject: Boolean,
    OnClick: ClickAction,
    PlayFull: Boolean,
    PresentationOrder: Double,
    Sound: String,
    SoundOn: Boolean,
    Speed: AnimationSpeed,
    TextEffect: AnimationEffect,
    Verb: Double
  ): GraphicObjectShape = {
    val __obj = js.Dynamic.literal(Bookmark = Bookmark.asInstanceOf[js.Any], DimColor = DimColor.asInstanceOf[js.Any], DimHide = DimHide.asInstanceOf[js.Any], DimPrevious = DimPrevious.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], IsEmptyPresentationObject = IsEmptyPresentationObject.asInstanceOf[js.Any], IsPresentationObject = IsPresentationObject.asInstanceOf[js.Any], OnClick = OnClick.asInstanceOf[js.Any], PlayFull = PlayFull.asInstanceOf[js.Any], PresentationOrder = PresentationOrder.asInstanceOf[js.Any], Sound = Sound.asInstanceOf[js.Any], SoundOn = SoundOn.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any], TextEffect = TextEffect.asInstanceOf[js.Any], Verb = Verb.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, GraphicObjectShape)
    __obj.asInstanceOf[GraphicObjectShape]
  }
}
