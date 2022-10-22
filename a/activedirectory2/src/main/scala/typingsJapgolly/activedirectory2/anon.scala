package typingsJapgolly.activedirectory2

import typingsJapgolly.activedirectory2.activedirectory2Booleans.`false`
import typingsJapgolly.activedirectory2.activedirectory2Strings.cn
import typingsJapgolly.activedirectory2.activedirectory2Strings.comment
import typingsJapgolly.activedirectory2.activedirectory2Strings.description
import typingsJapgolly.activedirectory2.activedirectory2Strings.displayName
import typingsJapgolly.activedirectory2.activedirectory2Strings.distinguishedName
import typingsJapgolly.activedirectory2.activedirectory2Strings.dn
import typingsJapgolly.activedirectory2.activedirectory2Strings.employeeID
import typingsJapgolly.activedirectory2.activedirectory2Strings.givenName
import typingsJapgolly.activedirectory2.activedirectory2Strings.initials
import typingsJapgolly.activedirectory2.activedirectory2Strings.ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
import typingsJapgolly.activedirectory2.activedirectory2Strings.lockoutTime
import typingsJapgolly.activedirectory2.activedirectory2Strings.mail
import typingsJapgolly.activedirectory2.activedirectory2Strings.objectCategory
import typingsJapgolly.activedirectory2.activedirectory2Strings.pwdLastSet
import typingsJapgolly.activedirectory2.activedirectory2Strings.sAMAccountName
import typingsJapgolly.activedirectory2.activedirectory2Strings.sn
import typingsJapgolly.activedirectory2.activedirectory2Strings.userAccountControl
import typingsJapgolly.activedirectory2.activedirectory2Strings.userPrincipalName
import typingsJapgolly.activedirectory2.activedirectory2Strings.whenCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ca extends StObject {
    
    var ca: js.UndefOr[String] = js.undefined
    
    var cert: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var rejectUnauthorized: Boolean
  }
  object Ca {
    
    inline def apply(rejectUnauthorized: Boolean): Ca = {
      val __obj = js.Dynamic.literal(rejectUnauthorized = rejectUnauthorized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ca]
    }
    
    extension [Self <: Ca](x: Self) {
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enabled extends StObject {
    
    var enabled: `false`
    
    var exclude: js.Tuple3[
        /* ldaps?://ForestDnsZones\..* /.* */ String, 
        /* ldaps?://DomainDnsZones\..* /.* */ String, 
        ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
      ]
  }
  object Enabled {
    
    inline def apply(
      exclude: js.Tuple3[
          /* ldaps?://ForestDnsZones\..* /.* */ String, 
          /* ldaps?://DomainDnsZones\..* /.* */ String, 
          ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
        ]
    ): Enabled = {
      val __obj = js.Dynamic.literal(enabled = false, exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setExclude(
        value: js.Tuple3[
              /* ldaps?://ForestDnsZones\..* /.* */ String, 
              /* ldaps?://DomainDnsZones\..* /.* */ String, 
              ldapsQuestionmarkColonSlashSlashDotAsteriskSlashCNEqualssignConfigurationCommaDotAsterisk
            ]
      ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Group extends StObject {
    
    var group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]
    
    var user: js.Tuple17[
        dn, 
        distinguishedName, 
        userPrincipalName, 
        sAMAccountName, 
        mail, 
        lockoutTime, 
        whenCreated, 
        pwdLastSet, 
        userAccountControl, 
        employeeID, 
        sn, 
        givenName, 
        initials, 
        cn, 
        displayName, 
        comment, 
        description
      ]
  }
  object Group {
    
    inline def apply(
      group: js.Tuple5[dn, cn, description, distinguishedName, objectCategory],
      user: js.Tuple17[
          dn, 
          distinguishedName, 
          userPrincipalName, 
          sAMAccountName, 
          mail, 
          lockoutTime, 
          whenCreated, 
          pwdLastSet, 
          userAccountControl, 
          employeeID, 
          sn, 
          givenName, 
          initials, 
          cn, 
          displayName, 
          comment, 
          description
        ]
    ): Group = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    extension [Self <: Group](x: Self) {
      
      inline def setGroup(value: js.Tuple5[dn, cn, description, distinguishedName, objectCategory]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setUser(
        value: js.Tuple17[
              dn, 
              distinguishedName, 
              userPrincipalName, 
              sAMAccountName, 
              mail, 
              lockoutTime, 
              whenCreated, 
              pwdLastSet, 
              userAccountControl, 
              employeeID, 
              sn, 
              givenName, 
              initials, 
              cn, 
              displayName, 
              comment, 
              description
            ]
      ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
