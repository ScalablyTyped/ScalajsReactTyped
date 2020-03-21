package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object otplib {
  type createHmacSecret = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typingsJapgolly.otplib.HmacOptions, 
    typingsJapgolly.node.Buffer
  ]
  type hotpCheck = js.Function4[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsJapgolly.otplib.HotpOptionsInterface, 
    scala.Boolean
  ]
  type hotpCounter = js.Function1[/* counter */ scala.Double, java.lang.String]
  type hotpDigest = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsJapgolly.otplib.HotpOptionsInterface, 
    java.lang.String
  ]
  type hotpOptions = js.Function1[/* options */ js.Any, typingsJapgolly.otplib.HotpOptionsInterface]
  type hotpSecret = typingsJapgolly.otplib.createHmacSecret
  type hotpToken = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typingsJapgolly.otplib.HotpOptionsInterface, 
    java.lang.String
  ]
  type totpCheck = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typingsJapgolly.otplib.TotpOptionsInterface, 
    scala.Boolean
  ]
  type totpCheckWithWindow = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typingsJapgolly.otplib.TotpOptionsInterface, 
    scala.Double | scala.Null
  ]
  type totpCounter = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpOptions = js.Function1[/* options */ js.Any, typingsJapgolly.otplib.TotpOptionsInterface]
  type totpSecret = typingsJapgolly.otplib.createHmacSecret
  type totpTimeRemaining = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpTimeUsed = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpToken = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typingsJapgolly.otplib.TotpOptionsInterface, 
    java.lang.String
  ]
}
