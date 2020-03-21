package typingsJapgolly.vegaTypings.transformMod

import typingsJapgolly.vegaTypings.exprMod.ExprRef
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.center
import typingsJapgolly.vegaTypings.vegaTypingsStrings.collide
import typingsJapgolly.vegaTypings.vegaTypingsStrings.link
import typingsJapgolly.vegaTypings.vegaTypingsStrings.nbody
import typingsJapgolly.vegaTypings.vegaTypingsStrings.x
import typingsJapgolly.vegaTypings.vegaTypingsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.transformMod.ForceCenter
  - typingsJapgolly.vegaTypings.transformMod.ForceCollide
  - typingsJapgolly.vegaTypings.transformMod.ForceLink
  - typingsJapgolly.vegaTypings.transformMod.ForceNBody
  - typingsJapgolly.vegaTypings.transformMod.ForceX
  - typingsJapgolly.vegaTypings.transformMod.ForceY
*/
trait Force extends js.Object

object Force {
  @scala.inline
  def ForceCollide(
    force: collide,
    iterations: Double | SignalRef = null,
    radius: Double | SignalRef | ExprRef = null,
    strength: Double | SignalRef = null
  ): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceY(force: y, strength: Double | SignalRef = null, y: FieldRef = null): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceNBody(
    force: nbody,
    distanceMax: Double | SignalRef = null,
    distanceMin: Double | SignalRef = null,
    strength: Double | SignalRef = null,
    theta: Double | SignalRef = null
  ): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (distanceMax != null) __obj.updateDynamic("distanceMax")(distanceMax.asInstanceOf[js.Any])
    if (distanceMin != null) __obj.updateDynamic("distanceMin")(distanceMin.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceCenter(force: center, x: Double | SignalRef = null, y: Double | SignalRef = null): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceLink(
    force: link,
    distance: Double | SignalRef | ExprRef = null,
    id: FieldRef = null,
    iterations: Double | SignalRef = null,
    links: DataName = null,
    strength: Double | SignalRef | ExprRef = null
  ): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceX(force: x, strength: Double | SignalRef = null, x: FieldRef = null): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
}

