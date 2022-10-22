package typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAdmin.firebaseAdminStrings.PHONE_SMS
import typingsJapgolly.firebaseAdmin.firebaseAdminStrings.phone
import typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MAXIMUM_TEST_PHONE_NUMBERS: /* 10 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MAXIMUM_TEST_PHONE_NUMBERS").asInstanceOf[/* 10 */ Double]

inline def validateTestPhoneNumbers(testPhoneNumbers: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTestPhoneNumbers")(testPhoneNumbers.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Identifies the server side second factor type. */
type AuthFactorServerType = PHONE_SMS

type AuthFactorType = phone

type CreateMultiFactorInfoRequest = CreatePhoneMultiFactorInfoRequest

type UpdateMultiFactorInfoRequest = UpdatePhoneMultiFactorInfoRequest
