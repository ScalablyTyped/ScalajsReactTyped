package typingsJapgolly.docxTemplates.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.docxTemplates.anon.Ctx
import typingsJapgolly.docxTemplates.anon.ModifiedSandbox
import typingsJapgolly.docxTemplates.docxTemplatesStrings.ALIAS
import typingsJapgolly.docxTemplates.docxTemplatesStrings.CMD_NODE
import typingsJapgolly.docxTemplates.docxTemplatesStrings.Dotgif
import typingsJapgolly.docxTemplates.docxTemplatesStrings.Dotjpeg
import typingsJapgolly.docxTemplates.docxTemplatesStrings.Dotjpg
import typingsJapgolly.docxTemplates.docxTemplatesStrings.Dotpng
import typingsJapgolly.docxTemplates.docxTemplatesStrings.Dotsvg
import typingsJapgolly.docxTemplates.docxTemplatesStrings.EXEC
import typingsJapgolly.docxTemplates.docxTemplatesStrings.FOR
import typingsJapgolly.docxTemplates.docxTemplatesStrings.HTML
import typingsJapgolly.docxTemplates.docxTemplatesStrings.IF
import typingsJapgolly.docxTemplates.docxTemplatesStrings.IMAGE
import typingsJapgolly.docxTemplates.docxTemplatesStrings.INS
import typingsJapgolly.docxTemplates.docxTemplatesStrings.LINK
import typingsJapgolly.docxTemplates.docxTemplatesStrings.QUERY
import typingsJapgolly.docxTemplates.docxTemplatesStrings.`END-FOR`
import typingsJapgolly.docxTemplates.docxTemplatesStrings.`END-IF`
import typingsJapgolly.docxTemplates.libTypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BUILT_IN_COMMANDS: js.Tuple12[QUERY, CMD_NODE, ALIAS, FOR, `END-FOR`, IF, `END-IF`, INS, EXEC, IMAGE, LINK, HTML] = ^.asInstanceOf[js.Dynamic].selectDynamic("BUILT_IN_COMMANDS").asInstanceOf[js.Tuple12[QUERY, CMD_NODE, ALIAS, FOR, `END-FOR`, IF, `END-IF`, INS, EXEC, IMAGE, LINK, HTML]]

inline def ImageExtensions: js.Tuple5[Dotpng, Dotgif, Dotjpg, Dotjpeg, Dotsvg] = ^.asInstanceOf[js.Dynamic].selectDynamic("ImageExtensions").asInstanceOf[js.Tuple5[Dotpng, Dotgif, Dotjpg, Dotjpeg, Dotsvg]]

type ErrorHandler = js.Function2[/* e */ js.Error, /* raw_code */ js.UndefOr[String], Any]

type Htmls = StringDictionary[String]

type Images = StringDictionary[Image]

type Links = StringDictionary[Link]

type QueryResolver = js.Function2[
/* query */ js.UndefOr[String], 
/* queryVars */ Any, 
ReportData | js.Promise[ReportData]]

type ReportData = Any

type RunJSFunc = js.Function1[/* o */ Ctx, ModifiedSandbox]

type VarValue = Any
