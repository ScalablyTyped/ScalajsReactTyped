package typingsJapgolly.zeroclipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ZC {
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  // Generic version EventHandler containers.
  // Mimicking native interfaces in lib.dom.d.ts of the same name.
  type EventListener[T /* <: typingsJapgolly.zeroclipboard.ZC.ZeroClipboardEvent */] = js.Function1[/* ev */ T, scala.Unit]
  type EventListenerOrEventListenerObject[T /* <: typingsJapgolly.zeroclipboard.ZC.ZeroClipboardEvent */] = typingsJapgolly.zeroclipboard.ZC.EventListener[T] | typingsJapgolly.zeroclipboard.ZC.EventListenerObject[T]
  type ZeroClipboardBeforeCopyEvent = typingsJapgolly.zeroclipboard.ZC.ZeroClipboardEvent
}
