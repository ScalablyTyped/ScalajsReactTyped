package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilTrackMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/track", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def track(options_ : TrackFields): Current = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(options_.asInstanceOf[js.Any]).asInstanceOf[Current]
  
  type Point = typingsJapgolly.unist.mod.Point
  
  type TrackFields = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.TrackFields
}
