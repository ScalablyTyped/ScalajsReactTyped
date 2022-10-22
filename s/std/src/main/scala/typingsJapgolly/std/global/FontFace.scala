package typingsJapgolly.std.global

import typingsJapgolly.std.BinaryData
import typingsJapgolly.std.FontFaceDescriptors
import typingsJapgolly.std.FontFaceLoadStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FontFace")
@js.native
open class FontFace protected ()
  extends StObject
     with typingsJapgolly.std.FontFace {
  /* standard dom */
  def this(family: java.lang.String, source: java.lang.String) = this()
  def this(family: java.lang.String, source: BinaryData) = this()
  def this(family: java.lang.String, source: java.lang.String, descriptors: FontFaceDescriptors) = this()
  def this(family: java.lang.String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
  
  /* standard dom */
  /* CompleteClass */
  var ascentOverride: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var descentOverride: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var display: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var family: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var featureSettings: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var lineGapOverride: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def load(): js.Promise[typingsJapgolly.std.FontFace] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val loaded: js.Promise[typingsJapgolly.std.FontFace] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val status: FontFaceLoadStatus = js.native
  
  /* standard dom */
  /* CompleteClass */
  var stretch: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var style: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var unicodeRange: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var variant: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var variationSettings: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var weight: java.lang.String = js.native
}
