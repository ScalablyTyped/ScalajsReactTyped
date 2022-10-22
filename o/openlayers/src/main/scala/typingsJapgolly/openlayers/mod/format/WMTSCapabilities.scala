package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.GlobalObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Format for reading WMTS capabilities data.
  *
  * @api
  */
@JSImport("openlayers", "format.WMTSCapabilities")
@js.native
/**
  * @classdesc
  * Format for reading WMTS capabilities data.
  *
  * @api
  */
open class WMTSCapabilities () extends XML {
  
  def read(source: String): GlobalObject = js.native
  /**
    * Read a WMTS capabilities document.
    *
    * @param source The XML source.
    * @return An object representing the WMTS capabilities.
    * @api
    */
  def read(source: Document): GlobalObject = js.native
  def read(source: Node): GlobalObject = js.native
}
