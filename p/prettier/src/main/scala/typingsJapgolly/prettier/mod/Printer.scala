package typingsJapgolly.prettier.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prettier.AnonEndOfLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printer extends js.Object {
  var canAttachComment: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.undefined
  var embed: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc_], 
      /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], 
      /* options */ ParserOptions, 
      Doc_ | Null
    ]
  ] = js.undefined
  var handleComments: js.UndefOr[AnonEndOfLine] = js.undefined
  var hasPrettierIgnore: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.undefined
  var insertPragma: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
  /**
    * @returns `null` if you want to remove this node
    * @returns `void` if you want to use modified newNode
    * @returns anything if you want to replace the node with it
    */
  var massageAstNode: js.UndefOr[js.Function3[/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any, _]] = js.undefined
  var printComments: js.UndefOr[
    js.Function4[
      /* path */ FastPath[_], 
      /* print */ js.Function1[/* path */ FastPath[_], Doc_], 
      /* options */ ParserOptions, 
      /* needsSemi */ Boolean, 
      Doc_
    ]
  ] = js.undefined
  var willPrintOwnComments: js.UndefOr[js.Function1[/* path */ FastPath[_], Boolean]] = js.undefined
  def print(path: FastPath[_], options: ParserOptions, print: js.Function1[/* path */ FastPath[_], Doc_]): Doc_
}

object Printer {
  @scala.inline
  def apply(
    print: (FastPath[js.Any], ParserOptions, js.Function1[/* path */ FastPath[js.Any], Doc_]) => CallbackTo[Doc_],
    canAttachComment: /* node */ js.Any => CallbackTo[Boolean] = null,
    embed: (/* path */ FastPath[js.Any], /* print */ js.Function1[/* path */ FastPath[js.Any], Doc_], /* textToDoc */ js.Function2[/* text */ String, /* options */ Options, Doc_], /* options */ ParserOptions) => CallbackTo[Doc_ | Null] = null,
    handleComments: AnonEndOfLine = null,
    hasPrettierIgnore: /* path */ FastPath[js.Any] => CallbackTo[Boolean] = null,
    insertPragma: /* text */ String => CallbackTo[String] = null,
    massageAstNode: (/* node */ js.Any, /* newNode */ js.Any, /* parent */ js.Any) => CallbackTo[js.Any] = null,
    printComments: (/* path */ FastPath[js.Any], /* print */ js.Function1[/* path */ FastPath[js.Any], Doc_], /* options */ ParserOptions, /* needsSemi */ Boolean) => CallbackTo[Doc_] = null,
    willPrintOwnComments: /* path */ FastPath[js.Any] => CallbackTo[Boolean] = null
  ): Printer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("print")(js.Any.fromFunction3((t0: typingsJapgolly.prettier.mod.FastPath[js.Any], t1: typingsJapgolly.prettier.mod.ParserOptions, t2: js.Function1[
  /* path */ typingsJapgolly.prettier.mod.FastPath[js.Any], 
  typingsJapgolly.prettier.mod.Doc_]) => print(t0, t1, t2).runNow()))
    if (canAttachComment != null) __obj.updateDynamic("canAttachComment")(js.Any.fromFunction1((t0: /* node */ js.Any) => canAttachComment(t0).runNow()))
    if (embed != null) __obj.updateDynamic("embed")(js.Any.fromFunction4((t0: /* path */ typingsJapgolly.prettier.mod.FastPath[js.Any], t1: /* print */ js.Function1[
  /* path */ typingsJapgolly.prettier.mod.FastPath[js.Any], 
  typingsJapgolly.prettier.mod.Doc_], t2: /* textToDoc */ js.Function2[
  /* text */ java.lang.String, 
  /* options */ typingsJapgolly.prettier.mod.Options, 
  typingsJapgolly.prettier.mod.Doc_], t3: /* options */ typingsJapgolly.prettier.mod.ParserOptions) => embed(t0, t1, t2, t3).runNow()))
    if (handleComments != null) __obj.updateDynamic("handleComments")(handleComments.asInstanceOf[js.Any])
    if (hasPrettierIgnore != null) __obj.updateDynamic("hasPrettierIgnore")(js.Any.fromFunction1((t0: /* path */ typingsJapgolly.prettier.mod.FastPath[js.Any]) => hasPrettierIgnore(t0).runNow()))
    if (insertPragma != null) __obj.updateDynamic("insertPragma")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => insertPragma(t0).runNow()))
    if (massageAstNode != null) __obj.updateDynamic("massageAstNode")(js.Any.fromFunction3((t0: /* node */ js.Any, t1: /* newNode */ js.Any, t2: /* parent */ js.Any) => massageAstNode(t0, t1, t2).runNow()))
    if (printComments != null) __obj.updateDynamic("printComments")(js.Any.fromFunction4((t0: /* path */ typingsJapgolly.prettier.mod.FastPath[js.Any], t1: /* print */ js.Function1[
  /* path */ typingsJapgolly.prettier.mod.FastPath[js.Any], 
  typingsJapgolly.prettier.mod.Doc_], t2: /* options */ typingsJapgolly.prettier.mod.ParserOptions, t3: /* needsSemi */ scala.Boolean) => printComments(t0, t1, t2, t3).runNow()))
    if (willPrintOwnComments != null) __obj.updateDynamic("willPrintOwnComments")(js.Any.fromFunction1((t0: /* path */ typingsJapgolly.prettier.mod.FastPath[js.Any]) => willPrintOwnComments(t0).runNow()))
    __obj.asInstanceOf[Printer]
  }
}

