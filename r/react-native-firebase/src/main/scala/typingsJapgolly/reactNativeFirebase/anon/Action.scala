package typingsJapgolly.reactNativeFirebase.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Importance
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.RemoteInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var Action: Instantiable3[
    /* action */ String, 
    /* icon */ String, 
    /* title */ String, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
  ]
  
  var BadgeIconType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ Any
  
  var Category: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
  
  var Channel: Instantiable3[
    /* channelId */ String, 
    /* name */ String, 
    /* importance */ Importance, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Channel
  ]
  
  var ChannelGroup: Instantiable2[
    /* groupId */ String, 
    /* name */ String, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.ChannelGroup
  ]
  
  var Defaults: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ Any
  
  var GroupAlert: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ Any
  
  var Importance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ Any
  
  var Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ Any
  
  var RemoteInput: Instantiable1[
    /* resultKey */ String, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.RemoteInput
  ]
  
  var SemanticAction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ Any
  
  var Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ Any
}
object Action {
  
  inline def apply(
    Action: Instantiable3[
      /* action */ String, 
      /* icon */ String, 
      /* title */ String, 
      typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
    ],
    BadgeIconType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ Any,
    Category: Category,
    Channel: Instantiable3[/* channelId */ String, /* name */ String, /* importance */ Importance, Channel],
    ChannelGroup: Instantiable2[/* groupId */ String, /* name */ String, ChannelGroup],
    Defaults: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ Any,
    GroupAlert: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ Any,
    Importance: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ Any,
    Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ Any,
    RemoteInput: Instantiable1[/* resultKey */ String, RemoteInput],
    SemanticAction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ Any,
    Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ Any
  ): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], BadgeIconType = BadgeIconType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Channel = Channel.asInstanceOf[js.Any], ChannelGroup = ChannelGroup.asInstanceOf[js.Any], Defaults = Defaults.asInstanceOf[js.Any], GroupAlert = GroupAlert.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], RemoteInput = RemoteInput.asInstanceOf[js.Any], SemanticAction = SemanticAction.asInstanceOf[js.Any], Visibility = Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(
      value: Instantiable3[
          /* action */ String, 
          /* icon */ String, 
          /* title */ String, 
          typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
        ]
    ): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setBadgeIconType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.BadgeIconType */ Any
    ): Self = StObject.set(x, "BadgeIconType", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: Category): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setChannel(
      value: Instantiable3[/* channelId */ String, /* name */ String, /* importance */ Importance, Channel]
    ): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelGroup(value: Instantiable2[/* groupId */ String, /* name */ String, ChannelGroup]): Self = StObject.set(x, "ChannelGroup", value.asInstanceOf[js.Any])
    
    inline def setDefaults(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Defaults */ Any
    ): Self = StObject.set(x, "Defaults", value.asInstanceOf[js.Any])
    
    inline def setGroupAlert(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.GroupAlert */ Any
    ): Self = StObject.set(x, "GroupAlert", value.asInstanceOf[js.Any])
    
    inline def setImportance(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Importance */ Any
    ): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    inline def setPriority(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Priority */ Any
    ): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setRemoteInput(value: Instantiable1[/* resultKey */ String, RemoteInput]): Self = StObject.set(x, "RemoteInput", value.asInstanceOf[js.Any])
    
    inline def setSemanticAction(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.SemanticAction */ Any
    ): Self = StObject.set(x, "SemanticAction", value.asInstanceOf[js.Any])
    
    inline def setVisibility(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Android.Visibility */ Any
    ): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
  }
}
