package typingsJapgolly.ndnJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faceMod {
  type OnInterestCallback = js.Function5[
    /* prefix */ typingsJapgolly.ndnJs.nameMod.Name, 
    /* interest */ typingsJapgolly.ndnJs.interestMod.Interest, 
    /* face */ typingsJapgolly.ndnJs.faceMod.Face, 
    /* filterId */ scala.Double, 
    /* filter */ typingsJapgolly.ndnJs.faceMod.InterestFilter, 
    js.Any
  ]
}
