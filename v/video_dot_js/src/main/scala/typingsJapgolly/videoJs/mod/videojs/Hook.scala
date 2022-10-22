package typingsJapgolly.videoJs.mod.videojs

import org.scalajs.dom.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hook {
  
  type BeforeSetup = js.Function2[/* element */ HTMLVideoElement, /* options */ Any, Any]
  
  type Setup = js.Function1[/* player */ Player, Unit]
}
