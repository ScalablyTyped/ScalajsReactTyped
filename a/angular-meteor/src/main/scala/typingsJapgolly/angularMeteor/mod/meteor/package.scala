package typingsJapgolly.angularMeteor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  /**
    * An object that connects a Meteor Collection to an AngularJS scope variable
    */
  type AngularMeteorCollection[T] = typingsJapgolly.angularMeteor.mod.meteor.AngularMeteorCollection2[T, T]
  type ILoginWithExternalService = js.Function1[
    /* options */ typingsJapgolly.meteor.Meteor.LoginWithExternalServiceOptions, 
    typingsJapgolly.angular.mod.IPromise[scala.Unit]
  ]
}
