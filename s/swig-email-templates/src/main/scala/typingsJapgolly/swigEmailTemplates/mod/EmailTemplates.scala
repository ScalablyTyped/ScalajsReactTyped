package typingsJapgolly.swigEmailTemplates.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplates extends js.Object {
  def generateSubject(
    templatePath: String,
    context: js.Any,
    cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
  ): Unit
  def generateText(
    templatePath: String,
    context: js.Any,
    html: String,
    cb: js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]
  ): Unit
  def render(
    templatePath: String,
    context: js.Any,
    cb: js.Function4[
      /* error */ js.Any, 
      /* inlinedHTML */ js.UndefOr[String], 
      /* text */ js.UndefOr[String], 
      /* subject */ js.UndefOr[String], 
      Unit
    ]
  ): Unit
  def rewriteUrls($: JQueryStatic, rewrite: js.Function1[/* href */ String, Unit]): Unit
}

object EmailTemplates {
  @scala.inline
  def apply(
    generateSubject: (String, js.Any, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Callback,
    generateText: (String, js.Any, String, js.Function2[/* error */ js.Any, /* text */ String | Null, Unit]) => Callback,
    render: (String, js.Any, js.Function4[
      /* error */ js.Any, 
      /* inlinedHTML */ js.UndefOr[String], 
      /* text */ js.UndefOr[String], 
      /* subject */ js.UndefOr[String], 
      Unit
    ]) => Callback,
    rewriteUrls: (JQueryStatic, js.Function1[/* href */ String, Unit]) => Callback
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generateSubject")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function2[/* error */ js.Any, /* text */ java.lang.String | scala.Null, scala.Unit]) => generateSubject(t0, t1, t2).runNow()))
    __obj.updateDynamic("generateText")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: java.lang.String, t3: js.Function2[/* error */ js.Any, /* text */ java.lang.String | scala.Null, scala.Unit]) => generateText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function4[
  /* error */ js.Any, 
  /* inlinedHTML */ js.UndefOr[java.lang.String], 
  /* text */ js.UndefOr[java.lang.String], 
  /* subject */ js.UndefOr[java.lang.String], 
  scala.Unit]) => render(t0, t1, t2).runNow()))
    __obj.updateDynamic("rewriteUrls")(js.Any.fromFunction2((t0: typingsJapgolly.jquery.JQueryStatic, t1: js.Function1[/* href */ java.lang.String, scala.Unit]) => rewriteUrls(t0, t1).runNow()))
    __obj.asInstanceOf[EmailTemplates]
  }
}

