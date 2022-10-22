package typingsJapgolly.plotlyJs.anon

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

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
trait PartialSceneAnnotations extends StObject {
  
  var annotations: js.UndefOr[PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign]] = js.undefined
  
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.undefined
  
  var aspectratio: js.UndefOr[PartialPoint] = js.undefined
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var camera: js.UndefOr[PartialCameraCenter] = js.undefined
  
  var captureevents: js.UndefOr[Boolean] = js.undefined
  
  var domain: js.UndefOr[PartialDomain] = js.undefined
  
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.undefined
  
  var hovermode: js.UndefOr[closest | `false`] = js.undefined
  
  var xaxis: js.UndefOr[PartialSceneAxisAutorange] = js.undefined
  
  var yaxis: js.UndefOr[PartialSceneAxisAutorange] = js.undefined
  
  var zaxis: js.UndefOr[PartialSceneAxisAutorange] = js.undefined
}
object PartialSceneAnnotations {
  
  inline def apply(): PartialSceneAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAnnotations]
  }
  
  extension [Self <: PartialSceneAnnotations](x: Self) {
    
    inline def setAnnotations(value: PartialAnnotationsAlign | js.Array[PartialAnnotationsAlign]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: PartialAnnotationsAlign*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAspectmode(value: auto | cube | data | manual): Self = StObject.set(x, "aspectmode", value.asInstanceOf[js.Any])
    
    inline def setAspectmodeUndefined: Self = StObject.set(x, "aspectmode", js.undefined)
    
    inline def setAspectratio(value: PartialPoint): Self = StObject.set(x, "aspectratio", value.asInstanceOf[js.Any])
    
    inline def setAspectratioUndefined: Self = StObject.set(x, "aspectratio", js.undefined)
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setCamera(value: PartialCameraCenter): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    inline def setCaptureeventsUndefined: Self = StObject.set(x, "captureevents", js.undefined)
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    inline def setDragmodeUndefined: Self = StObject.set(x, "dragmode", js.undefined)
    
    inline def setHovermode(value: closest | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    inline def setHovermodeUndefined: Self = StObject.set(x, "hovermode", js.undefined)
    
    inline def setXaxis(value: PartialSceneAxisAutorange): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    inline def setYaxis(value: PartialSceneAxisAutorange): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
    
    inline def setZaxis(value: PartialSceneAxisAutorange): Self = StObject.set(x, "zaxis", value.asInstanceOf[js.Any])
    
    inline def setZaxisUndefined: Self = StObject.set(x, "zaxis", js.undefined)
  }
}
