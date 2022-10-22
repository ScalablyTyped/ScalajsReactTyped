package typingsJapgolly.kakaomaps.global.kakao.maps

import org.scalajs.dom.HTMLElement
import typingsJapgolly.kakaomaps.kakao.maps.RoadviewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kakao.maps.Roadview")
@js.native
open class Roadview protected ()
  extends StObject
     with typingsJapgolly.kakaomaps.kakao.maps.Roadview {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: RoadviewOptions) = this()
  
  /* CompleteClass */
  override def getPanoId(): Double = js.native
  
  /* CompleteClass */
  override def getPosition(): typingsJapgolly.kakaomaps.kakao.maps.LatLng = js.native
  
  /* CompleteClass */
  override def getViewpoint(): typingsJapgolly.kakaomaps.kakao.maps.Viewpoint = js.native
  
  /* CompleteClass */
  override def getViewpointWithPanoId(): typingsJapgolly.kakaomaps.kakao.maps.Viewpoint = js.native
  
  /* CompleteClass */
  override def relayout(): Unit = js.native
  
  /* CompleteClass */
  override def setPanoId(panoId: Double, position: typingsJapgolly.kakaomaps.kakao.maps.LatLng): Unit = js.native
  
  /* CompleteClass */
  override def setViewpoint(viewpoint: typingsJapgolly.kakaomaps.kakao.maps.Viewpoint): Unit = js.native
}
