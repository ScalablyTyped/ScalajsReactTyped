package typingsJapgolly.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashiconMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/dashicon", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Dashicon {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-appearance`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-collapse`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-comments`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-customizer`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-generic`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-home`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-links`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-media`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-multisite`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-network`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-page`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-plugins`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-post`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-settings`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-tools`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-users`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.airplane
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.album
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-center`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-full-width`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-left`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-none`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-pull-left`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-pull-right`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-right`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-wide`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.amazon
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.analytics
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.archive
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.art
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.awards
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.backup
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bank
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.beer
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bell
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`block-default`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.book
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`book-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-activity`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-community`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-forums`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-friends`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-groups`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-pm`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-replies`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-topics`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.building
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businessman
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businessperson
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businesswoman
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.button
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.calculator
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.calendar
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`calendar-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.camera
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`camera-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.car
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.carrot
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.cart
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.category
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-area`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-bar`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-line`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-pie`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.clipboard
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.clock
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.cloud
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cloud-saved`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cloud-upload`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`code-standards`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.coffee
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`color-picker`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.columns
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-back`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-forward`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-pause`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-play`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-repeat`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-skipback`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-skipforward`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-volumeon`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cover-image`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dashboard
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.database
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-add`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-export`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-import`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-remove`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-view`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.desktop
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dismiss
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.download
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.drumstick
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.edit
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`edit-large`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`edit-page`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-alignleft`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-alignright`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-bold`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-break`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-code`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-contract`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-customchar`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-expand`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-help`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-indent`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-insertmore`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-italic`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-justify`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ltr`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ol`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-outdent`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paragraph`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paste-text`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paste-word`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-quote`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-rtl`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-table`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-textcolor`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ul`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-underline`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-unlink`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-video`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ellipsis
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.email
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`email-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`email-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-audio`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-generic`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-photo`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-post`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-video`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`excerpt-view`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.exit
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.external
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.facebook
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`facebook-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feedback
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.filter
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.flag
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.food
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-aside`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-audio`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-chat`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-gallery`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-image`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-quote`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-status`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-video`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.forms
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`fullscreen-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`fullscreen-exit-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.games
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.google
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`grid-view`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.groups
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hammer
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.heading
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.heart
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hidden
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hourglass
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.html
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.id
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`id-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-crop`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-filter`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate-left`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate-right`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`images-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`images-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`index-card`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.info
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`info-outline`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.insert
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`insert-after`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`insert-before`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.instagram
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.laptop
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.layout
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.leftright
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.lightbulb
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.linkedin
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`list-view`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.location
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`location-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.lock
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.marker
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-archive`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-audio`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-code`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-default`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-document`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-interactive`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-text`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-video`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.megaphone
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.menu
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt3`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.microphone
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.migrate
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.minus
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.money
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`money-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.move
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.nametag
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.networking
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.no
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`no-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`open-folder`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.palmtree
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.paperclip
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pdf
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.performance
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pets
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.phone
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pinterest
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`playlist-audio`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`playlist-video`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plugins-checked`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.plus
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plus-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plus-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.podio
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.portfolio
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`post-status`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pressthis
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.printer
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.privacy
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.products
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.randomize
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.reddit
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.redo
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.remove
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`rest-api`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.rss
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.saved
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.schedule
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.screenoptions
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.search
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.share
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`share-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`share-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.shield
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`shield-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.shortcode
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.slides
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.smartphone
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.smiley
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sort
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sos
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.spotify
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-empty`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-filled`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-half`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sticky
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.store
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.superhero
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`superhero-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-after`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-before`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-delete`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-after`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-before`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-delete`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tablet
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tag
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tagcloud
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.testimonial
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.text
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`text-page`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`thumbs-down`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`thumbs-up`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tickets
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`tickets-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tide
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.translation
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.trash
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.twitch
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.twitter
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`twitter-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.undo
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`universal-access`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`universal-access-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.unlock
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.update
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`update-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.upload
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.vault
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt2`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt3`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.visibility
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.warning
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-add-page`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-comments`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-view-site`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.whatsapp
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.wordpress
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`wordpress-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.xing
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.yes
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`yes-alt`
      - typingsJapgolly.wordpressComponents.wordpressComponentsStrings.youtube
    */
    trait Icon extends StObject
    object Icon {
      
      inline def `admin-appearance`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-appearance` = "admin-appearance".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-appearance`]
      
      inline def `admin-collapse`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-collapse` = "admin-collapse".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-collapse`]
      
      inline def `admin-comments`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-comments` = "admin-comments".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-comments`]
      
      inline def `admin-customizer`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-customizer` = "admin-customizer".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-customizer`]
      
      inline def `admin-generic`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-generic` = "admin-generic".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-generic`]
      
      inline def `admin-home`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-home` = "admin-home".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-home`]
      
      inline def `admin-links`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-links` = "admin-links".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-links`]
      
      inline def `admin-media`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-media` = "admin-media".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-media`]
      
      inline def `admin-multisite`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-multisite` = "admin-multisite".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-multisite`]
      
      inline def `admin-network`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-network` = "admin-network".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-network`]
      
      inline def `admin-page`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-page` = "admin-page".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-page`]
      
      inline def `admin-plugins`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-plugins` = "admin-plugins".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-plugins`]
      
      inline def `admin-post`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-post` = "admin-post".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-post`]
      
      inline def `admin-settings`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-settings` = "admin-settings".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-settings`]
      
      inline def `admin-site`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site` = "admin-site".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site`]
      
      inline def `admin-site-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt` = "admin-site-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt`]
      
      inline def `admin-site-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2` = "admin-site-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2`]
      
      inline def `admin-site-alt3`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3` = "admin-site-alt3".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3`]
      
      inline def `admin-tools`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-tools` = "admin-tools".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-tools`]
      
      inline def `admin-users`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-users` = "admin-users".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`admin-users`]
      
      inline def airplane: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.airplane = "airplane".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.airplane]
      
      inline def album: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.album = "album".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.album]
      
      inline def `align-center`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-center` = "align-center".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-center`]
      
      inline def `align-full-width`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-full-width` = "align-full-width".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-full-width`]
      
      inline def `align-left`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-left` = "align-left".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-left`]
      
      inline def `align-none`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-none` = "align-none".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-none`]
      
      inline def `align-pull-left`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-pull-left` = "align-pull-left".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-pull-left`]
      
      inline def `align-pull-right`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-pull-right` = "align-pull-right".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-pull-right`]
      
      inline def `align-right`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-right` = "align-right".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-right`]
      
      inline def `align-wide`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-wide` = "align-wide".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`align-wide`]
      
      inline def amazon: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.amazon = "amazon".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.amazon]
      
      inline def analytics: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.analytics = "analytics".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.analytics]
      
      inline def archive: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.archive = "archive".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.archive]
      
      inline def `arrow-down`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down` = "arrow-down".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down`]
      
      inline def `arrow-down-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt` = "arrow-down-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt`]
      
      inline def `arrow-down-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2` = "arrow-down-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2`]
      
      inline def `arrow-left`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left` = "arrow-left".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left`]
      
      inline def `arrow-left-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt` = "arrow-left-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt`]
      
      inline def `arrow-left-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2` = "arrow-left-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2`]
      
      inline def `arrow-right`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right` = "arrow-right".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right`]
      
      inline def `arrow-right-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt` = "arrow-right-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt`]
      
      inline def `arrow-right-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2` = "arrow-right-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2`]
      
      inline def `arrow-up`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up` = "arrow-up".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up`]
      
      inline def `arrow-up-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt` = "arrow-up-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt`]
      
      inline def `arrow-up-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2` = "arrow-up-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2`]
      
      inline def art: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.art = "art".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.art]
      
      inline def awards: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.awards = "awards".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.awards]
      
      inline def backup: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.backup = "backup".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.backup]
      
      inline def bank: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bank = "bank".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bank]
      
      inline def beer: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.beer = "beer".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.beer]
      
      inline def bell: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bell = "bell".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bell]
      
      inline def `block-default`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`block-default` = "block-default".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`block-default`]
      
      inline def book: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.book = "book".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.book]
      
      inline def `book-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`book-alt` = "book-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`book-alt`]
      
      inline def `buddicons-activity`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-activity` = "buddicons-activity".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-activity`]
      
      inline def `buddicons-bbpress-logo`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo` = "buddicons-bbpress-logo".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo`]
      
      inline def `buddicons-buddypress-logo`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo` = "buddicons-buddypress-logo".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo`]
      
      inline def `buddicons-community`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-community` = "buddicons-community".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-community`]
      
      inline def `buddicons-forums`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-forums` = "buddicons-forums".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-forums`]
      
      inline def `buddicons-friends`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-friends` = "buddicons-friends".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-friends`]
      
      inline def `buddicons-groups`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-groups` = "buddicons-groups".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-groups`]
      
      inline def `buddicons-pm`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-pm` = "buddicons-pm".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-pm`]
      
      inline def `buddicons-replies`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-replies` = "buddicons-replies".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-replies`]
      
      inline def `buddicons-topics`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-topics` = "buddicons-topics".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-topics`]
      
      inline def `buddicons-tracking`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking` = "buddicons-tracking".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking`]
      
      inline def building: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.building = "building".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.building]
      
      inline def businessman: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businessman = "businessman".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businessman]
      
      inline def businessperson: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businessperson = "businessperson".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businessperson]
      
      inline def businesswoman: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businesswoman = "businesswoman".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.businesswoman]
      
      inline def button: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.button = "button".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.button]
      
      inline def calculator: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.calculator = "calculator".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.calculator]
      
      inline def calendar: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.calendar = "calendar".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.calendar]
      
      inline def `calendar-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`calendar-alt` = "calendar-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`calendar-alt`]
      
      inline def camera: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.camera = "camera".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.camera]
      
      inline def `camera-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`camera-alt` = "camera-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`camera-alt`]
      
      inline def car: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.car = "car".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.car]
      
      inline def carrot: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.carrot = "carrot".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.carrot]
      
      inline def cart: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.cart = "cart".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.cart]
      
      inline def category: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.category = "category".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.category]
      
      inline def `chart-area`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-area` = "chart-area".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-area`]
      
      inline def `chart-bar`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-bar` = "chart-bar".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-bar`]
      
      inline def `chart-line`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-line` = "chart-line".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-line`]
      
      inline def `chart-pie`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-pie` = "chart-pie".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`chart-pie`]
      
      inline def clipboard: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.clipboard = "clipboard".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.clipboard]
      
      inline def clock: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.clock = "clock".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.clock]
      
      inline def cloud: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.cloud = "cloud".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.cloud]
      
      inline def `cloud-saved`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cloud-saved` = "cloud-saved".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cloud-saved`]
      
      inline def `cloud-upload`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cloud-upload` = "cloud-upload".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cloud-upload`]
      
      inline def `code-standards`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`code-standards` = "code-standards".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`code-standards`]
      
      inline def coffee: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.coffee = "coffee".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.coffee]
      
      inline def `color-picker`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`color-picker` = "color-picker".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`color-picker`]
      
      inline def columns: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.columns = "columns".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.columns]
      
      inline def `controls-back`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-back` = "controls-back".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-back`]
      
      inline def `controls-forward`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-forward` = "controls-forward".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-forward`]
      
      inline def `controls-pause`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-pause` = "controls-pause".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-pause`]
      
      inline def `controls-play`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-play` = "controls-play".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-play`]
      
      inline def `controls-repeat`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-repeat` = "controls-repeat".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-repeat`]
      
      inline def `controls-skipback`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-skipback` = "controls-skipback".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-skipback`]
      
      inline def `controls-skipforward`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-skipforward` = "controls-skipforward".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-skipforward`]
      
      inline def `controls-volumeoff`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff` = "controls-volumeoff".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff`]
      
      inline def `controls-volumeon`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-volumeon` = "controls-volumeon".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`controls-volumeon`]
      
      inline def `cover-image`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cover-image` = "cover-image".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`cover-image`]
      
      inline def dashboard: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dashboard = "dashboard".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dashboard]
      
      inline def database: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.database = "database".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.database]
      
      inline def `database-add`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-add` = "database-add".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-add`]
      
      inline def `database-export`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-export` = "database-export".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-export`]
      
      inline def `database-import`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-import` = "database-import".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-import`]
      
      inline def `database-remove`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-remove` = "database-remove".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-remove`]
      
      inline def `database-view`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-view` = "database-view".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`database-view`]
      
      inline def desktop: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.desktop = "desktop".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.desktop]
      
      inline def dismiss: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dismiss = "dismiss".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.dismiss]
      
      inline def download: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.download = "download".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.download]
      
      inline def drumstick: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.drumstick = "drumstick".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.drumstick]
      
      inline def edit: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.edit = "edit".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.edit]
      
      inline def `edit-large`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`edit-large` = "edit-large".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`edit-large`]
      
      inline def `edit-page`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`edit-page` = "edit-page".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`edit-page`]
      
      inline def `editor-aligncenter`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter` = "editor-aligncenter".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter`]
      
      inline def `editor-alignleft`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-alignleft` = "editor-alignleft".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-alignleft`]
      
      inline def `editor-alignright`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-alignright` = "editor-alignright".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-alignright`]
      
      inline def `editor-bold`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-bold` = "editor-bold".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-bold`]
      
      inline def `editor-break`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-break` = "editor-break".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-break`]
      
      inline def `editor-code`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-code` = "editor-code".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-code`]
      
      inline def `editor-contract`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-contract` = "editor-contract".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-contract`]
      
      inline def `editor-customchar`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-customchar` = "editor-customchar".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-customchar`]
      
      inline def `editor-expand`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-expand` = "editor-expand".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-expand`]
      
      inline def `editor-help`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-help` = "editor-help".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-help`]
      
      inline def `editor-indent`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-indent` = "editor-indent".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-indent`]
      
      inline def `editor-insertmore`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-insertmore` = "editor-insertmore".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-insertmore`]
      
      inline def `editor-italic`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-italic` = "editor-italic".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-italic`]
      
      inline def `editor-justify`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-justify` = "editor-justify".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-justify`]
      
      inline def `editor-kitchensink`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink` = "editor-kitchensink".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink`]
      
      inline def `editor-ltr`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ltr` = "editor-ltr".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ltr`]
      
      inline def `editor-ol`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ol` = "editor-ol".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ol`]
      
      inline def `editor-ol-rtl`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl` = "editor-ol-rtl".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl`]
      
      inline def `editor-outdent`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-outdent` = "editor-outdent".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-outdent`]
      
      inline def `editor-paragraph`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paragraph` = "editor-paragraph".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paragraph`]
      
      inline def `editor-paste-text`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paste-text` = "editor-paste-text".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paste-text`]
      
      inline def `editor-paste-word`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paste-word` = "editor-paste-word".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-paste-word`]
      
      inline def `editor-quote`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-quote` = "editor-quote".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-quote`]
      
      inline def `editor-removeformatting`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting` = "editor-removeformatting".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting`]
      
      inline def `editor-rtl`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-rtl` = "editor-rtl".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-rtl`]
      
      inline def `editor-spellcheck`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck` = "editor-spellcheck".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck`]
      
      inline def `editor-strikethrough`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough` = "editor-strikethrough".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough`]
      
      inline def `editor-table`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-table` = "editor-table".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-table`]
      
      inline def `editor-textcolor`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-textcolor` = "editor-textcolor".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-textcolor`]
      
      inline def `editor-ul`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ul` = "editor-ul".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-ul`]
      
      inline def `editor-underline`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-underline` = "editor-underline".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-underline`]
      
      inline def `editor-unlink`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-unlink` = "editor-unlink".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-unlink`]
      
      inline def `editor-video`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-video` = "editor-video".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`editor-video`]
      
      inline def ellipsis: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ellipsis = "ellipsis".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.ellipsis]
      
      inline def email: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.email = "email".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.email]
      
      inline def `email-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`email-alt` = "email-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`email-alt`]
      
      inline def `email-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`email-alt2` = "email-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`email-alt2`]
      
      inline def `embed-audio`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-audio` = "embed-audio".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-audio`]
      
      inline def `embed-generic`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-generic` = "embed-generic".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-generic`]
      
      inline def `embed-photo`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-photo` = "embed-photo".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-photo`]
      
      inline def `embed-post`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-post` = "embed-post".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-post`]
      
      inline def `embed-video`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-video` = "embed-video".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`embed-video`]
      
      inline def `excerpt-view`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`excerpt-view` = "excerpt-view".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`excerpt-view`]
      
      inline def exit: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.exit = "exit".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.exit]
      
      inline def external: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.external = "external".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.external]
      
      inline def facebook: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.facebook]
      
      inline def `facebook-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`facebook-alt` = "facebook-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`facebook-alt`]
      
      inline def feedback: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feedback = "feedback".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.feedback]
      
      inline def filter: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.filter = "filter".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.filter]
      
      inline def flag: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.flag = "flag".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.flag]
      
      inline def food: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.food = "food".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.food]
      
      inline def `format-aside`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-aside` = "format-aside".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-aside`]
      
      inline def `format-audio`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-audio` = "format-audio".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-audio`]
      
      inline def `format-chat`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-chat` = "format-chat".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-chat`]
      
      inline def `format-gallery`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-gallery` = "format-gallery".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-gallery`]
      
      inline def `format-image`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-image` = "format-image".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-image`]
      
      inline def `format-quote`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-quote` = "format-quote".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-quote`]
      
      inline def `format-status`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-status` = "format-status".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-status`]
      
      inline def `format-video`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-video` = "format-video".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`format-video`]
      
      inline def forms: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.forms = "forms".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.forms]
      
      inline def `fullscreen-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`fullscreen-alt` = "fullscreen-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`fullscreen-alt`]
      
      inline def `fullscreen-exit-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`fullscreen-exit-alt` = "fullscreen-exit-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`fullscreen-exit-alt`]
      
      inline def games: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.games = "games".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.games]
      
      inline def google: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.google = "google".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.google]
      
      inline def `grid-view`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`grid-view` = "grid-view".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`grid-view`]
      
      inline def groups: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.groups = "groups".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.groups]
      
      inline def hammer: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hammer = "hammer".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hammer]
      
      inline def heading: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.heading = "heading".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.heading]
      
      inline def heart: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.heart = "heart".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.heart]
      
      inline def hidden: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hidden]
      
      inline def hourglass: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hourglass = "hourglass".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.hourglass]
      
      inline def html: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.html = "html".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.html]
      
      inline def id: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.id = "id".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.id]
      
      inline def `id-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`id-alt` = "id-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`id-alt`]
      
      inline def `image-crop`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-crop` = "image-crop".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-crop`]
      
      inline def `image-filter`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-filter` = "image-filter".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-filter`]
      
      inline def `image-flip-horizontal`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal` = "image-flip-horizontal".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal`]
      
      inline def `image-flip-vertical`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical` = "image-flip-vertical".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical`]
      
      inline def `image-rotate`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate` = "image-rotate".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate`]
      
      inline def `image-rotate-left`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate-left` = "image-rotate-left".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate-left`]
      
      inline def `image-rotate-right`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate-right` = "image-rotate-right".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`image-rotate-right`]
      
      inline def `images-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`images-alt` = "images-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`images-alt`]
      
      inline def `images-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`images-alt2` = "images-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`images-alt2`]
      
      inline def `index-card`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`index-card` = "index-card".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`index-card`]
      
      inline def info: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.info = "info".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.info]
      
      inline def `info-outline`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`info-outline` = "info-outline".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`info-outline`]
      
      inline def insert: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.insert = "insert".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.insert]
      
      inline def `insert-after`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`insert-after` = "insert-after".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`insert-after`]
      
      inline def `insert-before`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`insert-before` = "insert-before".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`insert-before`]
      
      inline def instagram: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.instagram]
      
      inline def laptop: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.laptop = "laptop".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.laptop]
      
      inline def layout: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.layout = "layout".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.layout]
      
      inline def leftright: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.leftright = "leftright".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.leftright]
      
      inline def lightbulb: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.lightbulb = "lightbulb".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.lightbulb]
      
      inline def linkedin: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.linkedin = "linkedin".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.linkedin]
      
      inline def `list-view`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`list-view` = "list-view".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`list-view`]
      
      inline def location: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.location = "location".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.location]
      
      inline def `location-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`location-alt` = "location-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`location-alt`]
      
      inline def lock: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.lock = "lock".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.lock]
      
      inline def marker: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.marker = "marker".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.marker]
      
      inline def `media-archive`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-archive` = "media-archive".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-archive`]
      
      inline def `media-audio`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-audio` = "media-audio".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-audio`]
      
      inline def `media-code`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-code` = "media-code".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-code`]
      
      inline def `media-default`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-default` = "media-default".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-default`]
      
      inline def `media-document`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-document` = "media-document".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-document`]
      
      inline def `media-interactive`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-interactive` = "media-interactive".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-interactive`]
      
      inline def `media-spreadsheet`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet` = "media-spreadsheet".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet`]
      
      inline def `media-text`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-text` = "media-text".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-text`]
      
      inline def `media-video`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-video` = "media-video".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`media-video`]
      
      inline def megaphone: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.megaphone = "megaphone".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.megaphone]
      
      inline def menu: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.menu = "menu".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.menu]
      
      inline def `menu-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt` = "menu-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt`]
      
      inline def `menu-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt2` = "menu-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt2`]
      
      inline def `menu-alt3`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt3` = "menu-alt3".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`menu-alt3`]
      
      inline def microphone: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.microphone = "microphone".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.microphone]
      
      inline def migrate: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.migrate = "migrate".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.migrate]
      
      inline def minus: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.minus = "minus".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.minus]
      
      inline def money: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.money = "money".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.money]
      
      inline def `money-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`money-alt` = "money-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`money-alt`]
      
      inline def move: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.move = "move".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.move]
      
      inline def nametag: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.nametag = "nametag".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.nametag]
      
      inline def networking: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.networking = "networking".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.networking]
      
      inline def no: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.no = "no".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.no]
      
      inline def `no-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`no-alt` = "no-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`no-alt`]
      
      inline def `open-folder`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`open-folder` = "open-folder".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`open-folder`]
      
      inline def palmtree: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.palmtree = "palmtree".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.palmtree]
      
      inline def paperclip: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.paperclip = "paperclip".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.paperclip]
      
      inline def pdf: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pdf = "pdf".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pdf]
      
      inline def performance: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.performance = "performance".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.performance]
      
      inline def pets: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pets = "pets".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pets]
      
      inline def phone: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.phone = "phone".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.phone]
      
      inline def pinterest: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pinterest = "pinterest".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pinterest]
      
      inline def `playlist-audio`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`playlist-audio` = "playlist-audio".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`playlist-audio`]
      
      inline def `playlist-video`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`playlist-video` = "playlist-video".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`playlist-video`]
      
      inline def `plugins-checked`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plugins-checked` = "plugins-checked".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plugins-checked`]
      
      inline def plus: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.plus = "plus".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.plus]
      
      inline def `plus-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plus-alt` = "plus-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plus-alt`]
      
      inline def `plus-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plus-alt2` = "plus-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`plus-alt2`]
      
      inline def podio: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.podio = "podio".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.podio]
      
      inline def portfolio: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.portfolio = "portfolio".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.portfolio]
      
      inline def `post-status`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`post-status` = "post-status".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`post-status`]
      
      inline def pressthis: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pressthis = "pressthis".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.pressthis]
      
      inline def printer: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.printer = "printer".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.printer]
      
      inline def privacy: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.privacy = "privacy".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.privacy]
      
      inline def products: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.products = "products".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.products]
      
      inline def randomize: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.randomize = "randomize".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.randomize]
      
      inline def reddit: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.reddit = "reddit".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.reddit]
      
      inline def redo: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.redo = "redo".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.redo]
      
      inline def remove: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.remove = "remove".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.remove]
      
      inline def `rest-api`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`rest-api` = "rest-api".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`rest-api`]
      
      inline def rss: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.rss = "rss".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.rss]
      
      inline def saved: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.saved = "saved".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.saved]
      
      inline def schedule: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.schedule = "schedule".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.schedule]
      
      inline def screenoptions: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.screenoptions = "screenoptions".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.screenoptions]
      
      inline def search: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.search = "search".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.search]
      
      inline def share: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.share = "share".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.share]
      
      inline def `share-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`share-alt` = "share-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`share-alt`]
      
      inline def `share-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`share-alt2` = "share-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`share-alt2`]
      
      inline def shield: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.shield = "shield".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.shield]
      
      inline def `shield-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`shield-alt` = "shield-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`shield-alt`]
      
      inline def shortcode: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.shortcode = "shortcode".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.shortcode]
      
      inline def slides: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.slides = "slides".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.slides]
      
      inline def smartphone: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.smartphone = "smartphone".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.smartphone]
      
      inline def smiley: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.smiley = "smiley".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.smiley]
      
      inline def sort: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sort = "sort".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sort]
      
      inline def sos: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sos = "sos".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sos]
      
      inline def spotify: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.spotify = "spotify".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.spotify]
      
      inline def `star-empty`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-empty` = "star-empty".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-empty`]
      
      inline def `star-filled`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-filled` = "star-filled".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-filled`]
      
      inline def `star-half`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-half` = "star-half".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`star-half`]
      
      inline def sticky: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sticky = "sticky".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.sticky]
      
      inline def store: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.store = "store".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.store]
      
      inline def superhero: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.superhero = "superhero".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.superhero]
      
      inline def `superhero-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`superhero-alt` = "superhero-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`superhero-alt`]
      
      inline def `table-col-after`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-after` = "table-col-after".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-after`]
      
      inline def `table-col-before`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-before` = "table-col-before".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-before`]
      
      inline def `table-col-delete`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-delete` = "table-col-delete".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-col-delete`]
      
      inline def `table-row-after`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-after` = "table-row-after".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-after`]
      
      inline def `table-row-before`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-before` = "table-row-before".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-before`]
      
      inline def `table-row-delete`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-delete` = "table-row-delete".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`table-row-delete`]
      
      inline def tablet: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tablet = "tablet".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tablet]
      
      inline def tag: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tag = "tag".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tag]
      
      inline def tagcloud: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tagcloud = "tagcloud".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tagcloud]
      
      inline def testimonial: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.testimonial = "testimonial".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.testimonial]
      
      inline def text: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.text = "text".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.text]
      
      inline def `text-page`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`text-page` = "text-page".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`text-page`]
      
      inline def `thumbs-down`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`thumbs-down` = "thumbs-down".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`thumbs-down`]
      
      inline def `thumbs-up`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`thumbs-up` = "thumbs-up".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`thumbs-up`]
      
      inline def tickets: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tickets = "tickets".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tickets]
      
      inline def `tickets-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`tickets-alt` = "tickets-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`tickets-alt`]
      
      inline def tide: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tide = "tide".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.tide]
      
      inline def translation: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.translation = "translation".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.translation]
      
      inline def trash: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.trash = "trash".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.trash]
      
      inline def twitch: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.twitch = "twitch".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.twitch]
      
      inline def twitter: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.twitter]
      
      inline def `twitter-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`twitter-alt` = "twitter-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`twitter-alt`]
      
      inline def undo: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.undo = "undo".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.undo]
      
      inline def `universal-access`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`universal-access` = "universal-access".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`universal-access`]
      
      inline def `universal-access-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`universal-access-alt` = "universal-access-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`universal-access-alt`]
      
      inline def unlock: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.unlock = "unlock".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.unlock]
      
      inline def update: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.update = "update".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.update]
      
      inline def `update-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`update-alt` = "update-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`update-alt`]
      
      inline def upload: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.upload = "upload".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.upload]
      
      inline def vault: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.vault = "vault".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.vault]
      
      inline def `video-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt` = "video-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt`]
      
      inline def `video-alt2`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt2` = "video-alt2".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt2`]
      
      inline def `video-alt3`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt3` = "video-alt3".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`video-alt3`]
      
      inline def visibility: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.visibility = "visibility".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.visibility]
      
      inline def warning: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.warning = "warning".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.warning]
      
      inline def `welcome-add-page`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-add-page` = "welcome-add-page".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-add-page`]
      
      inline def `welcome-comments`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-comments` = "welcome-comments".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-comments`]
      
      inline def `welcome-learn-more`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more` = "welcome-learn-more".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more`]
      
      inline def `welcome-view-site`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-view-site` = "welcome-view-site".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-view-site`]
      
      inline def `welcome-widgets-menus`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus` = "welcome-widgets-menus".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus`]
      
      inline def `welcome-write-blog`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog` = "welcome-write-blog".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog`]
      
      inline def whatsapp: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.whatsapp = "whatsapp".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.whatsapp]
      
      inline def wordpress: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.wordpress = "wordpress".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.wordpress]
      
      inline def `wordpress-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`wordpress-alt` = "wordpress-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`wordpress-alt`]
      
      inline def xing: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.xing = "xing".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.xing]
      
      inline def yes: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.yes = "yes".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.yes]
      
      inline def `yes-alt`: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`yes-alt` = "yes-alt".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`yes-alt`]
      
      inline def youtube: typingsJapgolly.wordpressComponents.wordpressComponentsStrings.youtube = "youtube".asInstanceOf[typingsJapgolly.wordpressComponents.wordpressComponentsStrings.youtube]
    }
    
    trait Props
      extends StObject
         with SVGProps[SVGSVGElement] {
      
      /**
        * ID of the dashicon to use.
        */
      var icon: Icon
      
      /**
        * Width of the icon (in pixels).
        * @defaultValue 20
        */
      var size: js.UndefOr[Double] = js.undefined
    }
    object Props {
      
      inline def apply(icon: Icon): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
  }
}
