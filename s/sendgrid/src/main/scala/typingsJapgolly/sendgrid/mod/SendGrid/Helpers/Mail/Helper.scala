package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Helper extends js.Object {
  var Asm: Instantiable2[
    /* group_id */ Double, 
    /* groups_to_display */ js.Array[Double], 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Asm
  ]
  var Attachment: Instantiable0[typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Attachment]
  var Bcc: Instantiable2[
    /* enable */ Boolean, 
    /* email */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Bcc
  ]
  var BypassListManagement: Instantiable1[
    /* enable */ Boolean, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.BypassListManagement
  ]
  var Category: Instantiable1[/* name */ String, typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Category]
  var ClickTracking: Instantiable2[
    /* enable */ Boolean, 
    /* enableText */ Boolean, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.ClickTracking
  ]
  var Content: Instantiable2[
    /* mimetype */ String, 
    /* text */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Content
  ]
  var CustomArgs: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.CustomArgs
  ]
  var Email: Instantiable2[
    /* address */ String, 
    js.UndefOr[/* name */ String], 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Email
  ]
  var Footer: Instantiable3[
    /* enable */ Boolean, 
    /* text */ String, 
    /* html */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Footer
  ]
  var Ganalytics: Instantiable6[
    /* enable */ Boolean, 
    /* utm_source */ String, 
    /* utm_medium */ String, 
    /* utm_term */ String, 
    /* utm_content */ String, 
    /* utm_campaign */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Ganalytics
  ]
  var Header: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Header
  ]
  var Mail: Instantiable0[typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Mail]
  var MailSettings: Instantiable0[typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.MailSettings]
  var OpenTracking: Instantiable2[
    /* enable */ Boolean, 
    /* subscriptionTag */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.OpenTracking
  ]
  var Personalization: Instantiable0[typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Personalization]
  var SandBoxMode: Instantiable1[
    /* enable */ Boolean, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.SandBoxMode
  ]
  var Section: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Section
  ]
  var SpamCheck: Instantiable3[
    /* enable */ Boolean, 
    /* threshold */ Double, 
    /* post_to_url */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.SpamCheck
  ]
  var SubscriptionTracking: Instantiable4[
    /* enable */ Boolean, 
    /* text */ String, 
    /* html */ String, 
    /* substitution_tag */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.SubscriptionTracking
  ]
  var Substitution: Instantiable2[
    /* key */ String, 
    /* value */ String, 
    typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Substitution
  ]
  var TrackingSettings: Instantiable0[typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.TrackingSettings]
}

object Helper {
  @scala.inline
  def apply(
    Asm: Instantiable2[/* group_id */ Double, /* groups_to_display */ js.Array[Double], Asm],
    Attachment: Instantiable0[Attachment],
    Bcc: Instantiable2[/* enable */ Boolean, /* email */ String, Bcc],
    BypassListManagement: Instantiable1[/* enable */ Boolean, BypassListManagement],
    Category: Instantiable1[/* name */ String, Category],
    ClickTracking: Instantiable2[/* enable */ Boolean, /* enableText */ Boolean, ClickTracking],
    Content: Instantiable2[/* mimetype */ String, /* text */ String, Content],
    CustomArgs: Instantiable2[/* key */ String, /* value */ String, CustomArgs],
    Email: Instantiable2[/* address */ String, js.UndefOr[/* name */ String], Email],
    Footer: Instantiable3[/* enable */ Boolean, /* text */ String, /* html */ String, Footer],
    Ganalytics: Instantiable6[
      /* enable */ Boolean, 
      /* utm_source */ String, 
      /* utm_medium */ String, 
      /* utm_term */ String, 
      /* utm_content */ String, 
      /* utm_campaign */ String, 
      Ganalytics
    ],
    Header: Instantiable2[/* key */ String, /* value */ String, Header],
    Mail: Instantiable0[typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Mail],
    MailSettings: Instantiable0[MailSettings],
    OpenTracking: Instantiable2[/* enable */ Boolean, /* subscriptionTag */ String, OpenTracking],
    Personalization: Instantiable0[Personalization],
    SandBoxMode: Instantiable1[/* enable */ Boolean, SandBoxMode],
    Section: Instantiable2[/* key */ String, /* value */ String, Section],
    SpamCheck: Instantiable3[/* enable */ Boolean, /* threshold */ Double, /* post_to_url */ String, SpamCheck],
    SubscriptionTracking: Instantiable4[
      /* enable */ Boolean, 
      /* text */ String, 
      /* html */ String, 
      /* substitution_tag */ String, 
      SubscriptionTracking
    ],
    Substitution: Instantiable2[/* key */ String, /* value */ String, Substitution],
    TrackingSettings: Instantiable0[TrackingSettings]
  ): Helper = {
    val __obj = js.Dynamic.literal(Asm = Asm.asInstanceOf[js.Any], Attachment = Attachment.asInstanceOf[js.Any], Bcc = Bcc.asInstanceOf[js.Any], BypassListManagement = BypassListManagement.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], ClickTracking = ClickTracking.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CustomArgs = CustomArgs.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Ganalytics = Ganalytics.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Mail = Mail.asInstanceOf[js.Any], MailSettings = MailSettings.asInstanceOf[js.Any], OpenTracking = OpenTracking.asInstanceOf[js.Any], Personalization = Personalization.asInstanceOf[js.Any], SandBoxMode = SandBoxMode.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], SpamCheck = SpamCheck.asInstanceOf[js.Any], SubscriptionTracking = SubscriptionTracking.asInstanceOf[js.Any], Substitution = Substitution.asInstanceOf[js.Any], TrackingSettings = TrackingSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Helper]
  }
}

