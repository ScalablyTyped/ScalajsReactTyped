package typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.phone
import typingsJapgolly.firebaseUtil.mod.NextFn
import typingsJapgolly.firebaseUtil.mod.Observer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FactorId = phone

type NextOrObserver[T] = (NextFn[T | Null]) | (Observer[T | Null])

type PhoneMultiFactorAssertion = MultiFactorAssertion

type RecaptchaParameters = StringDictionary[Any]

type UserProfile = Record[String, Any]
