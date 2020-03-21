package typingsJapgolly.draftConvert.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.draftConvert.AnonData
import typingsJapgolly.draftConvert.AnonEntity
import typingsJapgolly.draftConvert.draftConvertBooleans.`false`
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftBlockType
import typingsJapgolly.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConvertFromHTMLConfig extends js.Object {
  // Block styles:
  var htmlToBlock: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftBlockType | AnonData | `false`]
  ] = js.undefined
  // Html entities
  var htmlToEntity: js.UndefOr[
    js.Function6[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      Unit
    ]
  ] = js.undefined
  // Inline styles:
  var htmlToStyle: js.UndefOr[
    js.Function2[/* nodeName */ String, /* node */ HTMLElement, DraftInlineStyleType]
  ] = js.undefined
  // Text entities
  var textToEntity: js.UndefOr[
    js.Function5[
      /* text */ String, 
      /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], 
      /* getEntity */ js.Function1[
        /* key */ EntityKey, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ _
      ], 
      /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], 
      js.Array[AnonEntity]
    ]
  ] = js.undefined
}

object IConvertFromHTMLConfig {
  @scala.inline
  def apply(
    htmlToBlock: (/* nodeName */ String, /* node */ HTMLElement) => CallbackTo[DraftBlockType | AnonData | `false`] = null,
    htmlToEntity: (/* nodeName */ String, /* node */ HTMLElement, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[/* key */ EntityKey, js.Any], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => Callback = null,
    htmlToStyle: (/* nodeName */ String, /* node */ HTMLElement) => CallbackTo[DraftInlineStyleType] = null,
    textToEntity: (/* text */ String, /* createEntity */ js.Function3[/* type */ String, /* mutability */ String, /* data */ js.Object, EntityKey], /* getEntity */ js.Function1[/* key */ EntityKey, js.Any], /* mergeEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit], /* replaceEntityData */ js.Function2[/* key */ String, /* data */ js.Object, Unit]) => CallbackTo[js.Array[AnonEntity]] = null
  ): IConvertFromHTMLConfig = {
    val __obj = js.Dynamic.literal()
    if (htmlToBlock != null) __obj.updateDynamic("htmlToBlock")(js.Any.fromFunction2((t0: /* nodeName */ java.lang.String, t1: /* node */ org.scalajs.dom.raw.HTMLElement) => htmlToBlock(t0, t1).runNow()))
    if (htmlToEntity != null) __obj.updateDynamic("htmlToEntity")(js.Any.fromFunction6((t0: /* nodeName */ java.lang.String, t1: /* node */ org.scalajs.dom.raw.HTMLElement, t2: /* createEntity */ js.Function3[
  /* type */ java.lang.String, 
  /* mutability */ java.lang.String, 
  /* data */ js.Object, 
  typingsJapgolly.draftConvert.mod.EntityKey], t3: /* getEntity */ js.Function1[/* key */ typingsJapgolly.draftConvert.mod.EntityKey, js.Any], t4: /* mergeEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], t5: /* replaceEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit]) => htmlToEntity(t0, t1, t2, t3, t4, t5).runNow()))
    if (htmlToStyle != null) __obj.updateDynamic("htmlToStyle")(js.Any.fromFunction2((t0: /* nodeName */ java.lang.String, t1: /* node */ org.scalajs.dom.raw.HTMLElement) => htmlToStyle(t0, t1).runNow()))
    if (textToEntity != null) __obj.updateDynamic("textToEntity")(js.Any.fromFunction5((t0: /* text */ java.lang.String, t1: /* createEntity */ js.Function3[
  /* type */ java.lang.String, 
  /* mutability */ java.lang.String, 
  /* data */ js.Object, 
  typingsJapgolly.draftConvert.mod.EntityKey], t2: /* getEntity */ js.Function1[/* key */ typingsJapgolly.draftConvert.mod.EntityKey, js.Any], t3: /* mergeEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit], t4: /* replaceEntityData */ js.Function2[/* key */ java.lang.String, /* data */ js.Object, scala.Unit]) => textToEntity(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IConvertFromHTMLConfig]
  }
}

