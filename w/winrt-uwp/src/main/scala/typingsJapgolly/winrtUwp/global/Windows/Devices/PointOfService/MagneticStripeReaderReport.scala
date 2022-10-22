package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains data from the recently swiped card. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderReport")
@js.native
open class MagneticStripeReaderReport ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderReport {
  
  /** Gets the additional security or encryption information for the recently swiped card. */
  /* CompleteClass */
  var additionalSecurityInformation: IBuffer = js.native
  
  /** Gets the card authentication information for the recently swiped card. */
  /* CompleteClass */
  var cardAuthenticationData: IBuffer = js.native
  
  /** Gets the length of the raw CardAuthenticationData before it is encrypted. */
  /* CompleteClass */
  var cardAuthenticationDataLength: Double = js.native
  
  /** Gets the card type identifier for the recently swiped card. */
  /* CompleteClass */
  var cardType: Double = js.native
  
  /** Gets a dictionary of properties for the recently swiped card. */
  /* CompleteClass */
  var properties: IMapView[String, String] = js.native
  
  /** Gets the track data for Track 1. */
  /* CompleteClass */
  var track1: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 2. */
  /* CompleteClass */
  var track2: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 3. */
  /* CompleteClass */
  var track3: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
  
  /** Gets the track data for Track 4. */
  /* CompleteClass */
  var track4: typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackData = js.native
}
