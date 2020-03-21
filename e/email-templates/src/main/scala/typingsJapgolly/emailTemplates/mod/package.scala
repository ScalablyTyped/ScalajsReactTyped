package typingsJapgolly.emailTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // email-templates accepts nodemailer.createTransport options directly
  // too and calls createTransport if given a non-function, thus a lot
  // of different types accepted for transport
  type NodeMailerTransportOptions = typingsJapgolly.nodemailer.mailerMod.^  | typingsJapgolly.nodemailer.smtpPoolMod.^  | typingsJapgolly.nodemailer.smtpPoolMod.Options | typingsJapgolly.nodemailer.sendmailTransportMod.^  | typingsJapgolly.nodemailer.sendmailTransportMod.Options | typingsJapgolly.nodemailer.streamTransportMod.^  | typingsJapgolly.nodemailer.streamTransportMod.Options | typingsJapgolly.nodemailer.jsonTransportMod.^  | typingsJapgolly.nodemailer.jsonTransportMod.Options | typingsJapgolly.nodemailer.sesTransportMod.^  | typingsJapgolly.nodemailer.sesTransportMod.Options | typingsJapgolly.nodemailer.smtpTransportMod.^  | typingsJapgolly.nodemailer.smtpTransportMod.Options | java.lang.String
}
