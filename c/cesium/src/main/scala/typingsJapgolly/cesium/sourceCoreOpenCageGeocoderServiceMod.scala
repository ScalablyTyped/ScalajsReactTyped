package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.Abbrv
import typingsJapgolly.cesium.mod.OpenCageGeocoderService
import typingsJapgolly.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreOpenCageGeocoderServiceMod {
  
  @JSImport("cesium/Source/Core/OpenCageGeocoderService", JSImport.Default)
  @js.native
  open class default protected () extends OpenCageGeocoderService {
    def this(url: String, apiKey: String) = this()
    def this(url: Resource, apiKey: String) = this()
    def this(url: String, apiKey: String, params: Abbrv) = this()
    def this(url: Resource, apiKey: String, params: Abbrv) = this()
  }
}
