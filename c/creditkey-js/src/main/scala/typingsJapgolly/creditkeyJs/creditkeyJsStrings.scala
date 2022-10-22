package typingsJapgolly.creditkeyJs

import typingsJapgolly.creditkeyJs.mod.Copy
import typingsJapgolly.creditkeyJs.mod.Display
import typingsJapgolly.creditkeyJs.mod.Mode
import typingsJapgolly.creditkeyJs.mod.Platform
import typingsJapgolly.creditkeyJs.mod.Size
import typingsJapgolly.creditkeyJs.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creditkeyJsStrings {
  
  @js.native
  sealed trait approved
    extends StObject
       with Status
  inline def approved: approved = "approved".asInstanceOf[approved]
  
  @js.native
  sealed trait button
    extends StObject
       with Display
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait button_text
    extends StObject
       with Display
  inline def button_text: button_text = "button_text".asInstanceOf[button_text]
  
  @js.native
  sealed trait checkout
    extends StObject
       with Copy
  inline def checkout: checkout = "checkout".asInstanceOf[checkout]
  
  @js.native
  sealed trait declined
    extends StObject
       with Status
  inline def declined: declined = "declined".asInstanceOf[declined]
  
  @js.native
  sealed trait development
    extends StObject
       with Platform
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait large
    extends StObject
       with Size
  inline def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait medium
    extends StObject
       with Size
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait modal
    extends StObject
       with Mode
  inline def modal: modal = "modal".asInstanceOf[modal]
  
  @js.native
  sealed trait pdp
    extends StObject
       with Copy
  inline def pdp: pdp = "pdp".asInstanceOf[pdp]
  
  @js.native
  sealed trait pending
    extends StObject
       with Status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait production
    extends StObject
       with Platform
  inline def production: production = "production".asInstanceOf[production]
  
  @js.native
  sealed trait redirect
    extends StObject
       with Mode
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait small
    extends StObject
       with Size
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait staging
    extends StObject
       with Platform
  inline def staging: staging = "staging".asInstanceOf[staging]
  
  @js.native
  sealed trait text
    extends StObject
       with Display
  inline def text: text = "text".asInstanceOf[text]
}
