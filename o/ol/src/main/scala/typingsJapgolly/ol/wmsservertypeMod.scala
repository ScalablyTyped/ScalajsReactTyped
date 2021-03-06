package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/WMSServerType", JSImport.Namespace)
@js.native
object wmsservertypeMod extends js.Object {
  @js.native
  sealed trait WMSServerType extends js.Object
  
  @js.native
  object WMSServerType extends js.Object {
    @js.native
    sealed trait CARMENTA_SERVER extends WMSServerType
    
    @js.native
    sealed trait GEOSERVER extends WMSServerType
    
    @js.native
    sealed trait MAPSERVER extends WMSServerType
    
    @js.native
    sealed trait QGIS extends WMSServerType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "carmentaserver" */ val CARMENTA_SERVER: typingsJapgolly.ol.wmsservertypeMod.WMSServerType.CARMENTA_SERVER with String = js.native
    /* "geoserver" */ val GEOSERVER: typingsJapgolly.ol.wmsservertypeMod.WMSServerType.GEOSERVER with String = js.native
    /* "mapserver" */ val MAPSERVER: typingsJapgolly.ol.wmsservertypeMod.WMSServerType.MAPSERVER with String = js.native
    /* "qgis" */ val QGIS: typingsJapgolly.ol.wmsservertypeMod.WMSServerType.QGIS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WMSServerType with String] = js.native
  }
  
}

