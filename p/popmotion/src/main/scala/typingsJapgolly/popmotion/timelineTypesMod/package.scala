package typingsJapgolly.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object timelineTypesMod {
  type Instruction = scala.Double | java.lang.String | typingsJapgolly.popmotion.timelineTypesMod.AnimationDefinition | (js.Array[typingsJapgolly.popmotion.timelineTypesMod.AnimationDefinition | scala.Double])
  type TrackActions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.popmotion.actionMod.Action]
  type Tracks = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.popmotion.timelineTypesMod.AnimationDefinition]]
}
