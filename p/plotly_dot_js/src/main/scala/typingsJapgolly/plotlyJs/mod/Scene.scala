package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.anon.PartialAnnotationsArrowcolor
import typingsJapgolly.plotlyJs.anon.PartialCameraCenter
import typingsJapgolly.plotlyJs.anon.PartialDomain
import typingsJapgolly.plotlyJs.anon.PartialPoint
import typingsJapgolly.plotlyJs.anon.PartialSceneAxisBackgroundcolor
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`false`
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.closest
import typingsJapgolly.plotlyJs.plotlyJsStrings.cube
import typingsJapgolly.plotlyJs.plotlyJsStrings.data
import typingsJapgolly.plotlyJs.plotlyJsStrings.manual
import typingsJapgolly.plotlyJs.plotlyJsStrings.orbit
import typingsJapgolly.plotlyJs.plotlyJsStrings.pan
import typingsJapgolly.plotlyJs.plotlyJsStrings.turntable
import typingsJapgolly.plotlyJs.plotlyJsStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scene extends StObject {
  
  var annotations: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]
  
  var aspectmode: auto | cube | data | manual
  
  var aspectratio: PartialPoint
  
  var bgcolor: String
  
  var camera: PartialCameraCenter
  
  var captureevents: Boolean
  
  var domain: PartialDomain
  
  var dragmode: orbit | turntable | zoom | pan | `false`
  
  var hovermode: closest | `false`
  
  var xaxis: PartialSceneAxisBackgroundcolor
  
  var yaxis: PartialSceneAxisBackgroundcolor
  
  var zaxis: PartialSceneAxisBackgroundcolor
}
object Scene {
  
  inline def apply(
    annotations: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor],
    aspectmode: auto | cube | data | manual,
    aspectratio: PartialPoint,
    bgcolor: String,
    camera: PartialCameraCenter,
    captureevents: Boolean,
    domain: PartialDomain,
    dragmode: orbit | turntable | zoom | pan | `false`,
    hovermode: closest | `false`,
    xaxis: PartialSceneAxisBackgroundcolor,
    yaxis: PartialSceneAxisBackgroundcolor,
    zaxis: PartialSceneAxisBackgroundcolor
  ): Scene = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], aspectmode = aspectmode.asInstanceOf[js.Any], aspectratio = aspectratio.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], captureevents = captureevents.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], zaxis = zaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  
  extension [Self <: Scene](x: Self) {
    
    inline def setAnnotations(value: PartialAnnotationsArrowcolor | js.Array[PartialAnnotationsArrowcolor]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: PartialAnnotationsArrowcolor*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAspectmode(value: auto | cube | data | manual): Self = StObject.set(x, "aspectmode", value.asInstanceOf[js.Any])
    
    inline def setAspectratio(value: PartialPoint): Self = StObject.set(x, "aspectratio", value.asInstanceOf[js.Any])
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: PartialCameraCenter): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    inline def setHovermode(value: closest | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    inline def setXaxis(value: PartialSceneAxisBackgroundcolor): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxis(value: PartialSceneAxisBackgroundcolor): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setZaxis(value: PartialSceneAxisBackgroundcolor): Self = StObject.set(x, "zaxis", value.asInstanceOf[js.Any])
  }
}
