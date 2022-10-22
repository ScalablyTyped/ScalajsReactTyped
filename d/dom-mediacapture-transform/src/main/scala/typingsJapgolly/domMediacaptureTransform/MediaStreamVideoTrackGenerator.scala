package typingsJapgolly.domMediacaptureTransform

import typingsJapgolly.domWebcodecs.VideoFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.std.EventTarget because Already inherited
- typingsJapgolly.std.MediaStreamTrack because Already inherited
- typingsJapgolly.domMediacaptureTransform.MediaStreamVideoTrack because var conflicts: contentHint, enabled, onended, onmute, onunmute. Inlined clone */ @js.native
trait MediaStreamVideoTrackGenerator
  extends StObject
     with MediaStreamTrackGenerator[VideoFrame]
