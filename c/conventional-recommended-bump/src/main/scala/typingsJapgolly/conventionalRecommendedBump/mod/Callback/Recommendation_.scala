package typingsJapgolly.conventionalRecommendedBump.mod.Callback

import typingsJapgolly.conventionalRecommendedBump.mod.Callback.Recommendation.ReleaseType
import typingsJapgolly.conventionalRecommendedBump.mod.Options.WhatBump.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `recommendation` is an `object` with a single property, `releaseType`.
  *
  * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
  * or `undefined` if `whatBump` does not return a valid `level` property, or
  * the `level` property is not set by `whatBump`.
  */
trait Recommendation_ extends Result {
  /**
    * `releaseType` is a `string`: Possible values: `major`, `minor` and `patch`,
    * or `undefined` if `whatBump` does not return a valid `level` property, or
    * the `level` property is not set by `whatBump`.
    */
  var releaseType: js.UndefOr[ReleaseType] = js.undefined
}

object Recommendation_ {
  @scala.inline
  def apply(level: Int | Double = null, reason: String = null, releaseType: ReleaseType = null): Recommendation_ = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (releaseType != null) __obj.updateDynamic("releaseType")(releaseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recommendation_]
  }
}

