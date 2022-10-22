package typingsJapgolly.formatjsIntl.libSrcTypesMod

import typingsJapgolly.formatjsIntl.libSrcErrorMod.InvalidConfigError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MessageFormatError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingDataError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.MissingTranslationError
import typingsJapgolly.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError
import typingsJapgolly.intlMessageformat.mod.FormatError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type OnErrorFn = js.Function1[
/* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError, 
Unit]

type OnWarnFn = js.Function1[/* warning */ String, Unit]
