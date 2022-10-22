package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.dashjsStrings.audio
import typingsJapgolly.dashjs.dashjsStrings.image
import typingsJapgolly.dashjs.dashjsStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "BitrateInfo")
@js.native
open class BitrateInfo () extends StObject {
  
  var bitrate: Double = js.native
  
  var height: Double = js.native
  
  var mediaType: video | audio | image = js.native
  
  var qualityIndex: Double = js.native
  
  var scanType: String = js.native
  
  var width: Double = js.native
}
