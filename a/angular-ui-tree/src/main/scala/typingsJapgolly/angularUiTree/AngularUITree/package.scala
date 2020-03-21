package typingsJapgolly.angularUiTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AngularUITree {
  type IAcceptCallback = js.Function3[
    /* source */ typingsJapgolly.angularUiTree.AngularUITree.ITreeNodeScope, 
    /* destination */ typingsJapgolly.angularUiTree.AngularUITree.ITreeNodeScope, 
    /* destinationIndex */ scala.Double, 
    scala.Boolean
  ]
  type IDroppedCallback = js.Function1[/* eventInfo */ typingsJapgolly.angularUiTree.AngularUITree.IEventInfo, scala.Unit]
}
