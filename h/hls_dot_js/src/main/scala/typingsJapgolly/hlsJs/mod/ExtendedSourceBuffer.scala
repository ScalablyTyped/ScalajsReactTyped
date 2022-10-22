package typingsJapgolly.hlsJs.mod

import typingsJapgolly.std.SourceBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedSourceBuffer
  extends StObject
     with SourceBuffer {
  
  var changeType: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.native
  
  var ended: js.UndefOr[Boolean] = js.native
}
