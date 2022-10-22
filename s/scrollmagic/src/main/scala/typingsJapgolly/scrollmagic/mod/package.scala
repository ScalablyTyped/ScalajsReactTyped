package typingsJapgolly.scrollmagic.mod

import org.scalajs.dom.Element
import typingsJapgolly.scrollmagic.mod.^
import typingsJapgolly.scrollmagic.scrollmagicStrings.enter
import typingsJapgolly.scrollmagic.scrollmagicStrings.leave
import typingsJapgolly.scrollmagic.scrollmagicStrings.progress
import typingsJapgolly.scrollmagic.scrollmagicStrings.remove
import typingsJapgolly.scrollmagic.scrollmagicStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type ElementOrSelector = Element | String

type EnterEvent = SceneProgressEvent[enter]

type LeaveEvent = SceneProgressEvent[leave]

type ProgressEvent = SceneProgressEvent[progress]

type RemoveEvent = Event[remove]

type StartEvent = SceneProgressEvent[start]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsJapgolly.scrollmagic.scrollmagicStrings.onEnter
  - typingsJapgolly.scrollmagic.scrollmagicStrings.onCenter
  - typingsJapgolly.scrollmagic.scrollmagicStrings.onLeave
*/
type TriggerHook = _TriggerHook | Double
