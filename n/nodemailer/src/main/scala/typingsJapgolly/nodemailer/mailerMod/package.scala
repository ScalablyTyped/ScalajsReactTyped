package typingsJapgolly.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailerMod {
  type Headers = (org.scalablytyped.runtime.StringDictionary[
    java.lang.String | js.Array[java.lang.String] | typingsJapgolly.nodemailer.AnonPrepared
  ]) | js.Array[typingsJapgolly.nodemailer.AnonValue]
  type ListHeader = java.lang.String | typingsJapgolly.nodemailer.AnonComment
  type ListHeaders = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.nodemailer.mailerMod.ListHeader | (js.Array[
      js.Array[typingsJapgolly.nodemailer.mailerMod.ListHeader] | typingsJapgolly.nodemailer.mailerMod.ListHeader
    ])
  ]
  type PluginFunction = js.Function2[
    /* mail */ typingsJapgolly.nodemailer.mailMessageMod.^, 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit], 
    scala.Unit
  ]
}
