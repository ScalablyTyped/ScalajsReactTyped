package typingsJapgolly.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object User {
  
  trait Audience
    extends StObject
       with DJ {
    
    var ignores: js.Array[Any]
    
    var notifications: js.Array[Notification]
    
    var pp: Double
    
    var pw: Double
    
    var xp: Double
  }
  object Audience {
    
    inline def apply(
      avatarID: String,
      badge: String,
      blurp: Any,
      gRole: Double,
      grab: Boolean,
      id: Double,
      ignores: js.Array[Any],
      joined: String,
      language: String,
      level: Double,
      notifications: js.Array[Notification],
      pp: Double,
      pw: Double,
      role: Double,
      slug: String,
      status: Double,
      sub: Double,
      username: String,
      vote: Double,
      xp: Double
    ): Audience = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], blurp = blurp.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], grab = grab.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ignores = ignores.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], pp = pp.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audience]
    }
    
    extension [Self <: Audience](x: Self) {
      
      inline def setIgnores(value: js.Array[Any]): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      inline def setIgnoresVarargs(value: Any*): Self = StObject.set(x, "ignores", js.Array(value*))
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setPp(value: Double): Self = StObject.set(x, "pp", value.asInstanceOf[js.Any])
      
      inline def setPw(value: Double): Self = StObject.set(x, "pw", value.asInstanceOf[js.Any])
      
      inline def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
    }
  }
  
  trait DJ
    extends StObject
       with Room {
    
    var blurp: Any
    
    var grab: Boolean
    
    var status: Double
    
    var vote: Double
  }
  object DJ {
    
    inline def apply(
      avatarID: String,
      badge: String,
      blurp: Any,
      gRole: Double,
      grab: Boolean,
      id: Double,
      joined: String,
      language: String,
      level: Double,
      role: Double,
      slug: String,
      status: Double,
      sub: Double,
      username: String,
      vote: Double
    ): DJ = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], blurp = blurp.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], grab = grab.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
      __obj.asInstanceOf[DJ]
    }
    
    extension [Self <: DJ](x: Self) {
      
      inline def setBlurp(value: Any): Self = StObject.set(x, "blurp", value.asInstanceOf[js.Any])
      
      inline def setGrab(value: Boolean): Self = StObject.set(x, "grab", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setVote(value: Double): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default extends StObject {
    
    var avatarID: String
    
    var language: String
    
    var username: String
  }
  object Default {
    
    inline def apply(avatarID: String, language: String, username: String): Default = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setAvatarID(value: String): Self = StObject.set(x, "avatarID", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extended
    extends StObject
       with Default {
    
    var curatorPoints: Double
    
    var djPoints: Double
    
    var fans: Double
    
    var id: String
    
    var listenerPoints: Double
    
    var status: Double
  }
  object Extended {
    
    inline def apply(
      avatarID: String,
      curatorPoints: Double,
      djPoints: Double,
      fans: Double,
      id: String,
      language: String,
      listenerPoints: Double,
      status: Double,
      username: String
    ): Extended = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extended]
    }
    
    extension [Self <: Extended](x: Self) {
      
      inline def setCuratorPoints(value: Double): Self = StObject.set(x, "curatorPoints", value.asInstanceOf[js.Any])
      
      inline def setDjPoints(value: Double): Self = StObject.set(x, "djPoints", value.asInstanceOf[js.Any])
      
      inline def setFans(value: Double): Self = StObject.set(x, "fans", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setListenerPoints(value: Double): Self = StObject.set(x, "listenerPoints", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Room
    extends StObject
       with Default {
    
    var badge: String
    
    var gRole: Double
    
    var id: Double
    
    var joined: String
    
    var level: Double
    
    var role: Double
    
    var slug: String
    
    var sub: Double
  }
  object Room {
    
    inline def apply(
      avatarID: String,
      badge: String,
      gRole: Double,
      id: Double,
      joined: String,
      language: String,
      level: Double,
      role: Double,
      slug: String,
      sub: Double,
      username: String
    ): Room = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Room]
    }
    
    extension [Self <: Room](x: Self) {
      
      inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setGRole(value: Double): Self = StObject.set(x, "gRole", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJoined(value: String): Self = StObject.set(x, "joined", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setRole(value: Double): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  trait Update
    extends StObject
       with Extended {
    
    var dateJoined: String
  }
  object Update {
    
    inline def apply(
      avatarID: String,
      curatorPoints: Double,
      dateJoined: String,
      djPoints: Double,
      fans: Double,
      id: String,
      language: String,
      listenerPoints: Double,
      status: Double,
      username: String
    ): Update = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], dateJoined = dateJoined.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setDateJoined(value: String): Self = StObject.set(x, "dateJoined", value.asInstanceOf[js.Any])
    }
  }
  
  trait User
    extends StObject
       with Room {
    
    var guest: Boolean
    
    var silver: Boolean
  }
  object User {
    
    inline def apply(
      avatarID: String,
      badge: String,
      gRole: Double,
      guest: Boolean,
      id: Double,
      joined: String,
      language: String,
      level: Double,
      role: Double,
      silver: Boolean,
      slug: String,
      sub: Double,
      username: String
    ): typingsJapgolly.plugapi.mod.User.User = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], guest = guest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], silver = silver.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.plugapi.mod.User.User]
    }
    
    extension [Self <: typingsJapgolly.plugapi.mod.User.User](x: Self) {
      
      inline def setGuest(value: Boolean): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
      
      inline def setSilver(value: Boolean): Self = StObject.set(x, "silver", value.asInstanceOf[js.Any])
    }
  }
}
