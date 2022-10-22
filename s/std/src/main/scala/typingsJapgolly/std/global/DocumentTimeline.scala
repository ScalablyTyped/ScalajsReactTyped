package typingsJapgolly.std.global

import typingsJapgolly.std.DocumentTimelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DocumentTimeline")
@js.native
/* standard dom */
open class DocumentTimeline ()
  extends StObject
     with typingsJapgolly.std.AnimationTimeline {
  def this(options: DocumentTimelineOptions) = this()
  
  /* standard dom */
  /* CompleteClass */
  override val currentTime: Double | Null = js.native
}
