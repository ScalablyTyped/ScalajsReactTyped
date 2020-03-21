package typingsJapgolly.vmap.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the player with either an inline ad response or a reference to an ad response
  */
trait VMAPAdSource extends js.Object {
  /**
    * Contains a URI to the VAST
    */
  var adTagURI: String
  /**
    * Indicates whether a VAST ad pod or multple buffet of ads can be served into an ad break
    */
  var allowMultipleAds: Boolean
  /**
    * Contains custom ad data
    */
  var customData: js.Any
  /**
    * Indicates whether the video player should honor the redirects within an ad response
    */
  var followRedirects: Boolean
  /**
    * Ad identifier for the ad source
    */
  var id: String
  /**
    * Contains an embedded VAST response
    */
  var vastAdData: Element
}

object VMAPAdSource {
  @scala.inline
  def apply(
    adTagURI: String,
    allowMultipleAds: Boolean,
    customData: js.Any,
    followRedirects: Boolean,
    id: String,
    vastAdData: Element
  ): VMAPAdSource = {
    val __obj = js.Dynamic.literal(adTagURI = adTagURI.asInstanceOf[js.Any], allowMultipleAds = allowMultipleAds.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], vastAdData = vastAdData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VMAPAdSource]
  }
}

