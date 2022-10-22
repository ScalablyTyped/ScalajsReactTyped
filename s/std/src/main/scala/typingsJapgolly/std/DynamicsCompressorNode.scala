package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  val attack: org.scalajs.dom.AudioParam = js.native
  
  /* standard dom */
  val knee: org.scalajs.dom.AudioParam = js.native
  
  /* standard dom */
  val ratio: org.scalajs.dom.AudioParam = js.native
  
  /* standard dom */
  val reduction: Double = js.native
  
  /* standard dom */
  val release: org.scalajs.dom.AudioParam = js.native
  
  /* standard dom */
  val threshold: org.scalajs.dom.AudioParam = js.native
}
