package typingsJapgolly.roads

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.roads.requestMod.default
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Request protected () extends default {
    /**
      * @todo: port should just be part of the host
      *
      * @param {boolean} secure - Whether or not this request should use HTTPS
      * @param {string} host - The hostname of all requests made by this function
      * @param {number} port - The post of all requests made by this function
      */
    def this(secure: Boolean, host: String, port: Double) = this()
  }
  
  @js.native
  class Response protected ()
    extends typingsJapgolly.roads.responseMod.default {
    /**
      * Creates a new Response object.
      *
      * @param {string} body - Your response body
      * @param {number} [status] - Your response status
      * @param {object} [headers] - Your response headers
      */
    def this(body: String) = this()
    def this(body: String, status: Double) = this()
    def this(body: String, status: Double, headers: js.Object) = this()
  }
  
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road class. This function does not accept any parameters!
    */
  class Road ()
    extends typingsJapgolly.roads.roadMod.default
  
  @js.native
  class RoadsPJAX protected ()
    extends typingsJapgolly.roads.pjaxMod.default {
    /**
      * Creates a new RoadsPjax instance. The road provided to this constructor will be the backbone of your PJAX requests.
      *
      * @param {Road} road - The road that will turn your pjax requests into HTML
      * @param {HTMLElement} container_element - The element that will be filled with your roads output
      * @param {Window} window - The pages window object to help set page title and other items
      */
    def this(road: typingsJapgolly.roads.roadMod.default, container_element: HTMLElement, window: Window_) = this()
  }
  
}

